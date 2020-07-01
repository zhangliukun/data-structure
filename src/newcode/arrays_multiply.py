'''
构建乘积数组
'''
import copy
class Solution:
    def multiply(self, A):
        # write code here
        A_len = len(A)
        B = copy.copy(A)
        B[0] = 1
        for i in range(1,A_len):
            B[i] = B[i-1]*A[i-1]

        temp = 1
        for i in range(A_len-2,-1,-1):
            temp = temp*A[i+1]
            B[i] = B[i]*temp

        return B

if __name__ == '__main__':
    A = [1,2,3,4,5]
    solo = Solution()
    print(solo.multiply(A))