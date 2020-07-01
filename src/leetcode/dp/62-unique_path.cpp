//
// Created by zale on 2020/6/8.
//

/**
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/unique-paths
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <map>
#include <array>
#include <vector>

using namespace std;


class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m,vector<int>(n,1));
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
};

int main(){
    int m= 7;
    int n = 3;

    cout <<"hellpo"<<endl;
    Solution s;
    cout<< s.uniquePaths(m,n)<<endl;
}


/**
python 代码
 class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        dp=[[0 for x in range(n)] for y in range(m)]
        for i in range(m):
            dp[0][i]=1
        for i in range(n):
            dp[i][0]=1
        for i in range(1,n):
            for j in range(1,m):
                dp[i][j]=dp[i-1][j]+dp[i][j-1]
        return (dp[n-1][m-1])
 **/