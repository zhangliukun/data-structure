//
// Created by zale on 2020/6/8.
//

/**
给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

说明：每次只能向下或者向右移动一步。

示例:

输入:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
输出: 7
解释: 因为路径 1→3→1→1→1 的总和最小。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-path-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <map>
#include <array>
#include <vector>

using namespace std;


/**
 *
 * 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。

你可以对一个单词进行如下三种操作：

插入一个字符
删除一个字符
替换一个字符
 

示例 1：

输入：word1 = "horse", word2 = "ros"
输出：3
解释：
horse -> rorse (将 'h' 替换为 'r')
rorse -> rose (删除 'r')
rose -> ros (删除 'e')
示例 2：

输入：word1 = "intention", word2 = "execution"
输出：5
解释：
intention -> inention (删除 't')
inention -> enention (将 'i' 替换为 'e')
enention -> exention (将 'n' 替换为 'x')
exention -> exection (将 'n' 替换为 'c')
exection -> execution (插入 'u')

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/edit-distance
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */


class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
//    int minPathSum() {
        int m = grid.size();
        int n = grid[0].size();
//        vector<vector<int>> dp(m,vector<int>(n,0));
//        for(int i=1; i<grid.size(); i++){
//            grid[i][0] += grid[i-1][0];
//        }
//        for(int j=1; j <grid[0].size();j++){
//            grid[0][j] += grid[0][j-1];
//        }
//        for (int i=1; i<grid.size();i++){
//            for (int j=1; j<grid[0].size();j++){
//                grid[i][j] += min(grid[i-1][j],grid[i][j-1]);
//            }
//        }

        // if 判断比上面快，这个双100%
        for (int i=0; i<grid.size();i++){
            for (int j=0; j<grid[0].size();j++){
                if(i==0 && j ==0){
                    continue;
                }else if(i == 0){
                    grid[i][j] += grid[i][j-1];
                }else if(j == 0){
                    grid[i][j] += grid[i-1][j];
                }else{
                    grid[i][j] += min(grid[i-1][j],grid[i][j-1]);
                }

            }
        }

        return grid[m-1][n-1];


    }
};

int main(){
    int m= 7;
    int n = 3;

    cout <<"hellpo"<<endl;
    Solution s;
}
