//
// Created by zale on 2020/6/28.
//


#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <map>
#include <array>
#include <vector>

using  namespace std;


/**
 * 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。

示例：

输入: S = "ADOBECODEBANC", T = "ABC"
输出: "BANC"
说明：

如果 S 中不存这样的子串，则返回空字符串 ""。
如果 S 中存在这样的子串，我们保证它是唯一的答案。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-window-substring
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */

class Solution {
public:

    unordered_map<char,int> ori,cnt; //ori是目标的字母的总数，cnt是当前的字母的数目

    bool check(){
        // p.first是key，p.second是value
        for(const auto &p: ori){
            if(cnt[p.first] < p.second){
                return false;
            }
        }
        return true;
    }

    string minWindow(string s, string t) {
        // 将目标子串的所有字符映射到map中
        for(const auto &c:t){
            ori[c]++;
        }

        int l=0,r=-1;
        int len=INT_MAX, ansL = -1, ansR = -1;


        while(r < int(s.size())){
            // 如果右端点这个值找到了，就将当前的map的value+1
            if(ori.find(s[++r]) != ori.end()){
                ++cnt[s[r]];
            }
            // 双指针更新左端点
            while(check() && l <= r){
                if (r - l + 1 < len){
                    len = r - l + 1;
                    ansL = l;
                }
                if(ori.find(s[l]) != ori.end()){
                    --cnt[s[l]];
                }
                ++l;
            }
        }
        return ansL == -1 ? string() : s.substr(ansL,len);
    }

};

int main(){

    Solution s;


}