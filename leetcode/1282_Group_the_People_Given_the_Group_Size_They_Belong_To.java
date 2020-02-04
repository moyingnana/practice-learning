class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashMap<Integer, List<Integer>> bucket = new HashMap<Integer, List<Integer>>();
        for(int i=0; i<groupSizes.length; i++){
            if(bucket.keySet().contains(groupSizes[i])){
                bucket.get(groupSizes[i]).add(i);
                if(bucket.get(groupSizes[i]).size() == groupSizes[i]){
                    list.add(bucket.get(groupSizes[i]));
                    bucket.remove(groupSizes[i]);
                }
            }else{
                List<Integer> numbers = new ArrayList<Integer>();
                numbers.add(i);
                bucket.put(groupSizes[i], numbers);
                if(numbers.size() == groupSizes[i]){
                    list.add(numbers);
                    bucket.remove(groupSizes[i]);
                }
            }
            }
        return list;
    }
}