# 题目描述
# 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
# 而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
# 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配

class Solution:
    # s, pattern都是字符串
    def match(self, s, pattern):
        # write code here
        k = 0
        flag = 0
        for i in range(len(s)):
            if k ==len(pattern):
                return False
            for j in range(k,len(pattern)):
                if s[i] == pattern[j] or pattern[j]=='.':
                    if flag == 1:
                        return False
                    else:
                        k = j+1
                        break
                elif pattern[j] == '*':
                    flag = 0
                    k = j+1
                    break
                else:
                    flag = 1

        if k != len(pattern)-1:
            return False





if __name__ == '__main__':
    solo = Solution()
    print(solo.match('aaa','a*a'))