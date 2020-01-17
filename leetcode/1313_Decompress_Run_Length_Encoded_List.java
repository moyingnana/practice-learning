class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < nums.length-1; i = i+2) {
            for (int j = 0; j < nums[i]; j++){
                ret.add(nums[i+1]);
            }
        }
        int[] ret_array = ret.stream().mapToInt(i->i).toArray();
        return ret_array;
    }
}