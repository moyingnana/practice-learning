class ProductOfNumbers {
    ArrayList<Integer> product;
    public ProductOfNumbers() {
        this.product = new ArrayList<Integer>();
    }
    
    public void add(int num) {
        this.product.add(num);
    }
    
    public int getProduct(int k) {
        int ret = 1;
        for (int i=this.product.size()-1; i>=this.product.size()-k; i--){
            if (this.product.get(i) != 1){
                ret = ret * this.product.get(i);
            }
        }
        return ret;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */