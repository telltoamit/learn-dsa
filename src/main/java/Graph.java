import java.util.*;

public class Graph {

    public static void main(String args[]) {


        List<List<Integer>> adj = List.of(
                List.of(1, 2, 3),
                List.of(0, 2, 3),
                List.of(1, 3, 0),
                List.of(1, 2, 0),
                List.of(4)
        );
        boolean[] visited =new boolean[adj.size()];
        for (int i=0;i<5;i++) {

            applyDfs(i, adj,visited );

        }
        System.out.println();
        for (int i=0;i<5;i++) {


            applyBFS(i, adj,visited );
        }


    }

    public static void applyDfs(int vertex, List<List<Integer>> adj, boolean[] visited) {

        Stack<Integer> stack = new Stack<>();
        if (!visited[vertex]) {
            stack.push(vertex);
            visited[vertex]=true;
        }
        while (!stack.isEmpty()) {
            Integer v = stack.pop();
                System.out.print(v + " ");
            List<Integer> adjV = adj.get(v);
            for (Integer vertx : adjV) {
                if (!visited[vertx]) {
                    stack.push(vertx);
                    visited[vertx]=true;
                }
            }

        }

    }

    public  static  void applyBFS(int v, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer>  queue = new ArrayDeque<>();
        queue.add(v);
        if(!visited[v]) {
            visited[v] = true;
        }
        while(!queue.isEmpty()){
            int V = queue.poll();

            System.out.print(v + " ");

            for(Integer vertext: adj.get(V)) {
                if(!visited[vertext]) {
                    queue.add(vertext);
                    visited[vertext] = true;
                }
            }
        }
    }

}

