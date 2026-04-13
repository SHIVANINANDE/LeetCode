class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] list=new int[numCourses];
        int[] indegree=new int[numCourses];
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int req[]: prerequisites){
            int u=req[0];
            int v=req[1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0)q.add(i);
        }
        int idx=0;
        while(!q.isEmpty()){
            int node=q.poll();
            list[idx++]=node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        return idx == numCourses ? list : new int[]{};

    }
}