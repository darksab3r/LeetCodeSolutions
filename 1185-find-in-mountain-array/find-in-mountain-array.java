/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    //can be done using binar search
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int start=0;
        int end=peak;
        // checking in left side
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid)==target) return mid;  //return if you encounter the element
            else if(mountainArr.get(mid)>target) end=mid-1;
            else start=mid+1;
        }
        //checking in right side
        start=peak+1;
        end=mountainArr.length()-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid)==target) return mid;
            else if(mountainArr.get(mid)>target) start=mid+1;
            else end=mid-1;
        }

        return -1;
    }
    public int findPeak(MountainArray mountainArr){
        int low = 1;
        int high = mountainArr.length() - 2;
        while (low < high) {
            int testIndex = (low + high) / 2;
            if (mountainArr.get(testIndex) < mountainArr.get(testIndex+1)) {
                low = testIndex + 1;
            } else {
                high = testIndex;
            }
        }
        return low;
    }
}