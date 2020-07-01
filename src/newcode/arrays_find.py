# 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
# 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
# 判断数组中是否含有该整数。

class Solution:
    # array 二维列表
    def Find(self, target, array):
        # write code here

        # 方法一：暴力法，时间复杂度O(N^2)，空间复杂度O(1)
        # for i in range(len(array)):
        #     for j in range(len(array[i])):
        #         if target == array[i][j]:
        #             return True
        # return False

        # 方法二：逐行采用二分查找，时间复杂度O(MlogN)，空间复杂度O(1)
        # for i in range(len(array)):
        #     array_len = len(array[i])
        #     if array_len==0 or array[i][0]>target or array[i][array_len-1]<target:
        #         continue
        #     elif self.binary_search(array[i],target):
        #         return True
        # return False

        # 方法三：右上或者左下查找法
        # 左下角开始查找，大了右移，小了左移
        row = len(array)
        cols = len(array[0])
        if cols == 0:
            return False
        i = row-1
        j = 0
        while(i>=0 and j<cols):
            if array[i][j] == target:
                return True
            elif array[i][j] > target:
                i = i - 1
            else:
                j = j + 1
        return False


    def binary_search(self,array,target):
        low = 0
        high = len(array)-1
        while(low<=high):
            mid = (low + high)//2
            if array[mid] == target:
                return True
            elif array[mid] > target:
                high = mid-1
            else:
                low = mid+1
        return False


if __name__ == '__main__':
    solo = Solution()
    array = [[1,2,3],[4,5,6],[5,6,7]]
    target = 1

    # array = [[]]
    # target = 16
    print(solo.Find(target,array))