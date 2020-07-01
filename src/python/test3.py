# 输入：arr = [3,1,1,1,5,1,2,1], target = 3
# 输出：3
# 解释：注意子数组 [1,2] 和 [2,1] 不能成为一个方案因为它们重叠了。

class Solution(object):
    def minSumOfLengths(self, arr, target):
        """
        :type arr: List[int]
        :type target: int
        :rtype: int
        """
        length_list = []
        end = -1
        start = 0
        for i in range(len(arr)):
            sum = 0
            if i < start:
                continue
            else:
                start = i
            # if arr[i]> target:
            #     start = i + 1
            #     continue
            for j in range(start,len(arr)):
                sum += arr[j]
                if sum > target:
                    # if j == start:
                    #     start = j+1
                    # else:
                    #     start = j
                    start +=1
                    break
                elif sum == target:
                    result_len = j - start + 1
                    if(len(length_list)>0 and start<=end and (result_len)<length_list[-1]):
                        length_list[-1] = result_len
                        print('replace',arr[start:j + 1])
                        end = j
                    elif start>end:
                        length_list.append(j-start+1)
                        print(arr[start:j + 1])
                        end = j
                    start +=1
                    break

        if len(length_list)<2:
            return -1
        else:
            length_list = sorted(length_list)
            return length_list[0]+ length_list[1]



if __name__ == '__main__':
    #arr = [3,2,2,4,3];target = 3
    # arr = [7,3,4,7];target = 7
    # arr = [4,3,2,6,2,3,4];target = 6
    # arr = [5,5,4,4,5];target=3
    # arr = [3,1,1,1,5,1,2,1];target=3
    # arr =[78,18,1,94,1,1,1,29,58,3,4,1,2,56,17,19,4,1,63,2,16,11,1,1,2,1,25,62,10,69,12,7,1,6,2,92,4,1,61,7,26,1,1,1,67,26,2,2,70,25,2,68,13,4,11,1,34,14,7,37,4,1,12,51,25,2,4,3,56,21,7,8,5,93,1,1,2,55,14,25,1,1,1,89,6,1,1,24,22,50,1,28,9,51,9,88,1,7,1,30,32,18,12,3,2,18,10,4,11,43,6,5,93,2,2,68,18,11,47,33,17,27,56,13,1,2,29,1,17,1,10,15,18,3,1,86,7,4,16,45,3,29,2,1,1,31,19,18,16,12,1,56,4,35,1,1,36,59,1,1,16,58,18,4,1,43,31,15,6,1,1,6,49,27,12,1,2,80,14,2,1,21,32,18,15,11,59,10,1,14,3,3,7,15,4,55,4,1,12,4,1,1,53,37,2,5,72,3,6,10,3,3,83,8,1,5];target = 97
    # arr=[1,6,1];target=7
    # arr = [47, 17, 4, 8, 8, 2, 1, 1, 8, 35, 30, 1, 11, 1, 1, 1, 44, 1, 3, 27, 2, 8];target=88
    arr = [26, 5, 16, 1, 2, 2, 25, 20, 1, 5, 1, 9, 32, 4, 2, 2, 3, 34, 6, 8, 1, 1, 2, 45, 2, 2, 1, 1, 1, 50, 1, 1, 32, 6, 7, 6, 1, 37];target =52
    # for i in range(len(arr)-1):
    #     if arr[i]+arr[i+1] == 97:
    #         print(arr[i]," ",arr[i+1])
    #         print(i)

    s = Solution()
    print(s.minSumOfLengths(arr,target))