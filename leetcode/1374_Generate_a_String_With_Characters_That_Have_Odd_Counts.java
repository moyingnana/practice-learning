class Solution {
    public String generateTheString(int n) {
        String ret = "";
        if (n == 1){
            ret = "x";
            return ret;
        }
        if (n%2 == 0){
            for (int i=0; i<n-1; i++){
                ret = ret + "x";
            }
            ret = ret + "y";
        }
        if (n%2 == 1){
            for (int i=0; i<n;  i++){
                ret = ret + "x";
            }
        }
        return ret;
    }
}