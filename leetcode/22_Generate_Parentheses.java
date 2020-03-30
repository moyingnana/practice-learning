class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<String>();
        recursive(n, n, "", ret);
        return ret;
    }
    public void recursive(int left, int right, String str, List<String> ls){
        if(left>right || left<0 || right<0){
            return;
        }
        if(left==0 && right==0){
            ls.add(str);
            return;
        }
        recursive(left-1, right, str+"(", ls);
        recursive(left, right-1, str+")", ls);
    }
}