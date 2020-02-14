class Solution {
    public int balancedStringSplit(String s) {
        char[] chararray = s.toCharArray();
        int Ln = 0;
        int Rn = 0;
        int ret = 0;
        for (int i = 0; i < chararray.length; i++) { 
            if (chararray[i] == 'L'){
                Ln++;
            }
            if (chararray[i] == 'R'){
                Rn++;
            }
            if (Ln == Rn){
                ret++;
            }
        }
        return ret;
    }
}