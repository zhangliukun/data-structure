//
// Created by zale on 2020/6/8.
//


#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <map>
#include <array>

using namespace std;


/**
 * 介绍 https://leetcode-cn.com/problems/implement-trie-prefix-tree/solution/shi-xian-trie-qian-zhui-shu-by-leetcode/
Trie (发音为 "try") 或前缀树是一种树数据结构，用于检索字符串数据集中的键。这一高效的数据结构有多种应用：
1. 自动补全 2. 拼写检查 3. IP 路由 (最长前缀匹配) 4. T9 (九宫格) 打字预测 5. 单词游戏
还有其他的数据结构，如平衡树和哈希表，使我们能够在字符串数据集中搜索单词。为什么我们还需要 Trie 树呢？尽管哈希表可以在 O(1) 时间内寻找键值，却无法高效的完成以下操作：
    - 找到具有同一前缀的全部键值。
    - 按词典序枚举字符串的数据集。
Trie 树优于哈希表的另一个理由是，随着哈希表大小增加，会出现大量的冲突，时间复杂度可能增加到 O(n)，其中 n 是插入的键的数量。与哈希表相比，
Trie 树在存储多个具有相同前缀的键时可以使用较少的空间。此时 Trie 树只需要 O(m) 的时间复杂度，其中 m 为键长。而在平衡树中查找键值需要O(mlogn) 时间复杂度。
 */


struct node{
    bool isEnd;
    map<char,node*> child; //两个作用：1.记录单词 2.记录单词对应分支结点地址
    node(){
        isEnd = false;
    }
};

class Trie {
private:
    node* root;
public:
    /** Initialize your data structure here. */
    Trie() {
        root = new node();
    }

    /** Inserts a word into the trie. */
    /**
     * 对于每一个字母如果：
     *  - 有：继续遍历对应孩子结点
     *  - 没有：增加字母与孩子结点
     * @param word
     */
    void insert(string word) {
        node* np = root;
        for(auto c:word){
            if(np->child.count(c)){
                np = np->child[c];
            } else{

                np->child.insert(make_pair(c,new node()));
                np = np->child[c];
            }
        }
        np->isEnd = true;
    }

    /** Returns if the word is in the trie. */
    /**
     * 两个条件：
     *  - 每个地方有对应字母
     *  - isEnd在对应的位置
     * @param word
     * @return
     */
    bool search(string word) {
        node* np = root;
        for(auto c:word){
            if(!np->child.count(c)){
                return false;
            }
            np = np->child[c];
        }
        return np->isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    /**
     *  search条件的削弱版,每个地方有对应的字母即可
     * @param prefix
     * @return
     */
    bool startsWith(string prefix) {
        node* np = root;
        for(auto c:prefix){
            if(!np->child.count(c)){
                return false;
            }
            np = np->child[c];
        }
        return true;
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */



int main(){

    Trie* obj = new Trie();
    obj->insert("hello");
    bool param_2 = obj->search("hello1");
    bool param_3 = obj->startsWith("hel");
    cout<<param_2<<param_3<<endl;

    return 0;


}

/**
 * 加了析构函数反之内存泄露
 */
class Trie_without_leadk {
public:
    /** Initialize your data structure here. */
    Trie_without_leadk():root_(new TreeNode) { }

    ~Trie_without_leadk() { destroy(root_); }

    /** Inserts a word into the trie. */

    void insert(const std::string& word) {
        if(word.empty()) return;

        TreeNode* curr = root_;
        for(const char& ch : word) {
            size_t index = ch -'a';
            if(curr->branchs[index] == nullptr)
            {
                curr->branchs[index] = new TreeNode;
            }
            curr = curr->branchs[index];
        }
        curr->end = true;
    }

    /** Returns if the word is in the trie. */
    bool search(const std::string& word) {
        if(word.empty()) return true;

        TreeNode* curr = root_;
        for(const char& ch : word) {
            int index = ch - 'a';
            if(curr->branchs[index] == nullptr)
            {
                return false;
            }

            curr = curr->branchs[index];
        }

        return curr->end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    bool startsWith(const std::string& prefix) {
        if(prefix.empty()) return true;

        TreeNode* curr = root_;
        for(const char& ch : prefix) {
            int index = ch - 'a';
            if(curr->branchs[index] == nullptr)
            {
                return false;
            }

            curr = curr->branchs[index];
        }

        return true;
    }

private:
    struct TreeNode {
        bool end; // 是否是某个字符串的结尾标志
        std::array<TreeNode*, 26> branchs;

        TreeNode(bool end=false)
                : end(end)
        {
            branchs.fill(nullptr);
        }
    };

    void destroy(TreeNode* node) {
        if(node ==nullptr) return;

        for(TreeNode* entry : node->branchs)
        {
            destroy(entry);
        }

        if(node)
        {
            delete node;
            node = nullptr;
        }
    }


    TreeNode* root_;
};
