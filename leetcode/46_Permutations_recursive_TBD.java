//Need optimization
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> sub = new ArrayList<Integer>();
        recursive(nums, 0, sub, ret);
        return ret;
    }
    public void recursive(int[] nums, int cur, List<Integer> sub, List<List<Integer>> ls){
        if (cur>=nums.length || nums==null){
            return;
        }
        if (sub.size()==nums.length){
            ls.add(sub);
            return;
        }
        if (cur==0){
            sub.add(nums[cur]);
            recursive(nums, cur+1, sub, ls);
            return;
        }
        for (int i=0; i<sub.size()-1; i++){
            List<Integer> tmp = new ArrayList<Integer>();
            tmp = sub;
            tmp.add(nums[cur]);
            for (int j=tmp.size()-1; j>i; j--){
                tmp.set(j, tmp.get(j-1));
            }
            tmp.set(i, nums[cur]);
            recursive(nums, cur+1, tmp, ls);
        }
        
    }
    public static void main(String args[]){
        int[] test=[1,2,3,4];
        System.out.println(permute(test));
    }

}