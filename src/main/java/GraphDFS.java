public class GraphDFS {

    public static void main(String args[]) {
      
      
      List<List<Integer>> adj = List.of(
                List.of(1, 2, 3),
                List.of(0, 2, 3),
                List.of(1, 3, 0),
                List.of(1,2,0)
        );
        applyDfs(0,adj,new boolean[adj.size()]);
    
    }
  
     public static void applyDfs(int vertex, List<List<Integer> adj, boolean[] visited) {
           
       Stack<Integer> stack = new Stack<>();
       stack.push(vertex);
       visited[vertex] = true;
        while(!stack.isEmpty()){
            Integer  v  = stack.pop();
           System.out.println(v);
            List<Integer> adjV = adj.get(v);
          for(Integer vertx : adjV) {
            if(!visited[vertx])  stack.push(vertx);
          }
          
        }
         
     }

}



private class Graph {
         
      Integer vertices;
      List<List<Integer> adj;
  
      Graph(int v) {
        adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            List<Integer> adjV = new ArrayList<>();
            adj.add(adjV);
        }
      }
      public List<Integer> getAdj(int v) {
          adj.get(v)
      }
      public void setAdj(int v1, int v) {
          adj.get(v).add(v1);
      }
  
  
  

}
