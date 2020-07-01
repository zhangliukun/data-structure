# 题目描述
# 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
# 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
# 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
# 那么对应的输出是第一个重复的数字2。

class Solution:
    # 这里要特别注意~找到任意重复的一个值并赋值到duplication[0]
    # 函数返回True/False
    def duplicate(self, numbers, duplication):
        # write code here
        # 方法一：排序后再遍历，时间复杂度O(NlogN),空间复杂度O(1)
        if not numbers or len(numbers) == 1:
            return False
        numbers.sort()
        temp = numbers[0]
        for i in range(1,len(numbers)):
            if temp == numbers[i]:
                duplication[0] = temp
                return True
            temp = numbers[i]
        return False

        # 方法二：使用哈希表，时间复杂度O(N)，空间复杂度O(N)
        num_set = set()
        for num in numbers:
            if num in num_set:
                duplication[0] = num
                return True
            num_set.add(num)
        return False

        # 方法三：下标定位法，时间复杂度O(N),空间复杂度O(1)
        # 已知数组中的每一个数字值小于数组长度，如果数组中无任何重复的数字，
        # 则数组从小到大排序后理应满足第i个位置对应的元素值是i。利用此特性解题
        for i in range(len(numbers)):
            while(numbers[i] != i):
                if numbers[i] == numbers[numbers[i]]:
                    duplication[0] = numbers[i]
                    return True
                temp  = numbers[i]
                numbers[i] = numbers[temp]
                numbers[temp] = temp
        return False


if __name__ == '__main__':
    solo = Solution()
    numbers = [2,3,1,0,2,5,3]
    result = [2221,222]
    print(solo.duplicate(numbers,result))
    print(result[0])