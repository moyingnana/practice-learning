class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int ret = 0;
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> managers = new HashSet<Integer>();
        q.add(headID);
        while(q.size()>0){
            int head = q.peek();
            for (int i=0; i<n; i++){
                if(manager[i]==head){
                    q.add(i);
                }
            }
            int managerId = manager[head];
            if(!managers.contains(managerId)){
                if(managerId != -1){
                    ret = ret + informTime[managerId];
                }
                managers.add(managerId);
            }
                
            q.remove();
        }
        return ret;
    }
}