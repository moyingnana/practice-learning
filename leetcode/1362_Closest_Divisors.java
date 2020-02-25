class Solution {
    public int[] closestDivisors(int num) {
        int product1 = num+1;
        int product2 = num+2;
        int element1_1 = 1;
        int element1_2 = product1;
        int diff1 = element1_2 - element1_1;
        int element2_1 = 1;
        int element2_2 = product2;
        int diff2 = element2_2 - element2_1;
        int[] ret = new int[2];
        int start1=(int)Math.sqrt(product1);
        int start2=(int)Math.sqrt(product2);
        for (int i=start1; i>=2; i--){
            int tmp = product1%i;
            if(tmp != 0){
                continue;
            }
            int tmpelement = product1/i;
            int tmpdiff = Math.abs(tmpelement-i);
            if(tmpdiff>diff1){
                break;
            }
            if(tmpdiff<diff1){
                element1_1 = i;
                element1_2 = tmpelement;
                diff1 = tmpdiff;
            }
        }
        for (int i=start2; i>=2; i--){
            int tmp = product2%i;
            if(tmp != 0){
                continue;
            }
            int tmpelement = product2/i;
            int tmpdiff = Math.abs(tmpelement-i);
            if(tmpdiff>diff2){
                break;
            }
            if(tmpdiff<diff2){
                element2_1 = i;
                element2_2 = tmpelement;
                diff2 = tmpdiff;
            }
        }
        if(diff1 <= diff2){
            ret[0] = element1_1;
            ret[1] = element1_2;
        }
        else{
            ret[0] = element2_1;
            ret[1] = element2_2;
        }
        return ret;
    }
}