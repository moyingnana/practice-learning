class Solution {
    public int subtractProductAndSum(int n) {
        int ret = 0;
        int product = 1;
        int sum = 0;
        int a = n/10;
        int b = n%10;
        while(a != 0 || b != 0){
            product = product * b;
            sum = sum + b;
            b = a%10;
            a = a/10;
        }
        ret = product - sum;
        return ret;
    }
}