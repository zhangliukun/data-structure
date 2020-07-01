#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int search(vector<int>& nums, int target) {
        int start=0,mid=0, end = nums.size();
        while (start < end){
            mid = start + (end - start) / 2; //这样算可以防止right+left可能会溢出的问题
            if(target < nums[mid]){
                end = mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    int search2(vector<int>& nums, int target) {
        int pivot, left = 0, right = nums.size() - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;
    }
};


int main() {

    vector<int> obj;
    for (int i=0;i<10;i++){
        obj.push_back(i);
    }
//    Solution* test = new Solution();
//    test->search()
    Solution test;
    cout<<test.search(obj,1);

    return 0;
}