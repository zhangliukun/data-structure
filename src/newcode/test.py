#coding=utf-8
# 本题为考试多行输入输出规范示例，无需提交，不计分。

# 1
# 5
# S###.
# ...#.
# E#.##
# .#..#
# .####

import sys
if __name__ == "__main__":

    next=[[0,1],[0,-1],[1,0],[-1,0]]


    T = int(sys.stdin.readline().strip())
    for i in range(T):
        n = int(sys.stdin.readline().strip())
        matrix = [[0]*n for i in range(n)]
        state = [[0]*n for i in range(n)]
        for j in range(n):
            line = sys.stdin.readline().strip()
            matrix[j] = line

        print(matrix)

        start_i = 0
        start_j = 0
        end_i = 0
        end_j = 0
        for row in range(n):
            for col in range(n):
                if matrix[row][col] == 'S':
                    start_i = row
                    start_j = col
                elif matrix[row][col] == 'E':
                    end_i = row
                    end_j = col

        current_i = start_i
        current_j = start_j
        flag = True
        while(flag):

            for step in next:
                if current_i+step[0]<0 or current_i+step[0]>n-1 \
                        or current_j+step[1]<0 or current_j+step[1]>n-1:
                    continue


                if matrix[current_i+step[0]][current_j+step[1]]=='#' and \
                        state[current_i+step[0]][current_j+step[1]]!='1':
                    current_i = current_i+step[0]
                    current_j = current_j+step[1]
                    print(current_i, current_j)
                    state[current_i][current_j] = '1'
                    break
                if matrix[current_i+step[0]][current_j+step[1]]=='E':
                    flag = False
                    break
