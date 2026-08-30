class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            arr[0] = 1;
            arr[i]=arr[i-1]*nums[i-1];
        }
        int rightproduct =1;
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]*=rightproduct;
            rightproduct*=nums[i];
        }
        return arr;
    }
}
