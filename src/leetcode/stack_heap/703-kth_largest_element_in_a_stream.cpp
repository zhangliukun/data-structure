#include <iostream>
#include <vector>
#include <queue>

using namespace std;

/**
 * 703. 数据流中的第K大元素
 * 题目描述：
设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。
每次调用 KthLargest.add，返回当前数据流中第K大的元素。
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);   // returns 4
kthLargest.add(5);   // returns 5
kthLargest.add(10);  // returns 5
kthLargest.add(9);   // returns 8
kthLargest.add(4);   // returns 8

**/

/**
 * 题解：
 * 方法一：直接使用C++自带小根堆来解决
    第k大/小的元素。首先想到的就是堆。
    堆有小根堆和大根堆。
    大根堆：priority_queue<int, vector<int>, less<int> > q;或者priority_queue<int> q;
    小根堆：priority_queue<int, vector<int>, greater<int> > q;
    priority_queue<Type, Container, Functional>
    Type为数据类型， Container为保存数据的容器，Functional为元素比较方式。
    如果不写后两个参数，那么容器默认用的是vector，比较方式默认用operator<，也就是优先队列是大顶堆，队头元素最大。

解题思路：
一. 将数组nums[]中的元素从minHeap[1]开始依次放入，这里分为 num.length >= k 和 num.length < k 两种情况
1. num.length >= k：
- 将num中的前个元素，依次放入堆中
- 从第k+1个元素开始，对元素进行add()操作
2. num.length < k：
- 将num中的前个元素，依次放入堆中
二. add()会判断是 num.length >= k 和 num.length < k 哪种情况
1. num.length >= k
- 此时堆为有序的，堆顶（即minHeap[1]），为堆中最小元素，同时也是所有数中第k大元素
- 若新元素>堆顶元素，则替换对顶元素，并对堆顶元素进行sink()（下沉操作），若新元素<=堆顶元素,则丢弃不作操作
2. num.length < k
- 由题nums.length >= k-1，所以当进行一次add()操作后堆会被填满
- 填满后对堆进行有序化

 * 方法二：使用multiset，利用它的自动排序


 */

class KthLargest {
private:
    priority_queue<int,vector<int>, greater<int>> p;
    int K;
public:
    KthLargest(int k, vector<int>& nums) {
        for(int n:nums){
            p.push(n);
            if(p.size() > k){ //大于k的话则弹出最大的值
                p.pop();
            }
        }
        K = k;
    }

    int add(int val) {
        p.push(val);
        if(p.size() > K){
            p.pop();
        }
        return p.top();
    }
};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */

int main() {


    return 0;
}