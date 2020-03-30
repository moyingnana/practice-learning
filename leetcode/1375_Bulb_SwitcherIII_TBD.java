class Solution {
    public int numTimesAllBlue(int[] light) {
        boolean[] onflag = new boolean[light.length];
        boolean[] blueflag = new boolean[light.length];
        HashSet<Integer> lights = new HashSet<Integer>();
        int ret = 0;
        for (int i=0; i<light.length; i++){
            onflag[i] = false;
            blueflag[i] = false;
        }
        for (int i=0; i<light.length; i++){
            int cur = light[i] - 1;
            onflag[cur] = true;
            lights.add(cur);
            boolean tmp = true;
            for(Integer bulb:lights){
                if(!blueflag[bulb]){
                    if(bulb==0){
                        blueflag[bulb] = true;
                    }
                    else{
                        boolean blue = true;
                        for (int p=0;p<bulb;p++){
                            blue = blue && onflag[p];
                        }
                        blueflag[bulb] = blue;
                    }
                }
                tmp = tmp && blueflag[bulb];
            }
            if(tmp){
                ret ++;
            }
        }
        return ret;
    }
}