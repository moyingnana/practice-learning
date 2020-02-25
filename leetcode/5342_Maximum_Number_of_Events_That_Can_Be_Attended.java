//Need optimization
class Solution {
    public int maxEvents(int[][] events) {
        HashSet<Integer> done = new HashSet<Integer>();
        HashSet<Integer> available = new HashSet<Integer>();
        HashSet<Integer> conflict = new HashSet<Integer>();
        for (int i=0; i<events.length; i++){
            boolean s = true;
            for (int k=1; k<events.length; k++){
                int cur = (i+k)%events.length;
                if(!(events[i][1]<events[cur][0] || events[i][0]>events[cur][1])){
                    s = false;
                    continue;
                }
            }
            if (s){
                done.add(i);
            }
            else{
                conflict.add(i);
                for (int j=events[i][0]; j<=events[i][1]; j++){
                    available.add(j);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(available); 
        Collections.sort(list); 
        for (int i=0; i<list.size(); i++){
            int day = list.get(i);
            int tmp = 100000;
            int n = -1;
            boolean f = false;
            Iterator<Integer> cur = conflict.iterator(); 
            while (cur.hasNext()){
                int cur_array = cur.next();
                int start = events[cur_array][0];
                int end = events[cur_array][1];
                if(!done.contains(cur_array) && start <= day && end >= day){
                    if (end-day <= tmp){
                        tmp = end-day;
                        n = cur_array;
                        f = true;
                    }
                }
            }
            if (f && !done.contains(n)){
                done.add(n);
                conflict.remove(n);
            }
            if (conflict.isEmpty()){
                break;
            }
        }
        return done.size();
    }
}