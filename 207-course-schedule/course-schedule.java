class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] indegree=new int[numCourses];
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int req[]: prerequisites){
            int u=req[0];
            int v=req[1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0)q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            list.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        return list.size()==numCourses;

    }
}