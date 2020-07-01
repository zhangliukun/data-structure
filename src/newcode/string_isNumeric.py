# 题目描述
# 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
# 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
# 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。


# 使用正则表达式
class Solution:
    # s字符串
    def isNumeric(self, s):
        # write code here
        pattern = "^[-+]?\\d*(?:\\.\\d*)?(?:[eE][+\\-]?\\d+)?$"
        import re
        if re.match(pattern, s, flags=0) is not None:
            return True
        else:
            return False

if __name__ == '__main__':
    solo = Solution()
    solo.isNumeric("12e+4.3")