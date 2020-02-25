class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashSet<Integer> left = new HashSet<Integer>();
        HashSet<Integer> right = new HashSet<Integer>();
        int leftson = 0;
        int rightson = 0;
        boolean ret = true;
        if (n==1){
            return ret;
        }
        for (int i=0; i<n; i++){
            if(leftChild[i]==0 || rightChild[i]==0){
                ret = false;
                return ret;
            }
            if (left.contains(rightChild[i]) || right.contains(leftChild[i])){
                ret = false;
                return ret;
            }
            if(leftChild[i]>0){
                leftson++;
                left.add(leftChild[i]);
            }
            if(rightChild[i]>0){
                rightson++;
                right.add(rightChild[i]);
            }
        }
        if(leftson+rightson+1 != n){
            ret = false;
        }
        return ret;
    }
}