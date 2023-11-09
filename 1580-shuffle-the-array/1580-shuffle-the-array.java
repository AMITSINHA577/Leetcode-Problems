class Solution {
    public int[] shuffle(int[] nums, int n) {
        int tempArr[] = new int [2*n];
        int j=0;
        for(int i=0;i<2*n;i=i+2){
            tempArr[i] = nums[j];
            tempArr[i+1] = nums[j+n];
            j++;
        }
        return tempArr;
        
    }
}