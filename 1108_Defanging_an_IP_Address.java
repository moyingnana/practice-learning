class Solution {
    public String defangIPaddr(String address) {
        String address_after=address.replaceAll("\\.", "[\\.]"); 
        return address_after;      
    }
}