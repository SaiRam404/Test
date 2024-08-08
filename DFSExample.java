import java.util.*;

public class DFSExample {
    public static void main(String[] args) {
        int[][] graph = {
            {1, 2},
            {0, 3, 4},
            {0, 4},
            {1},
            {1, 2}
        };

        boolean[] visited = new boolean[graph.length];
        dfs(graph, 0, visited);
    }

    public static void dfs(int[][] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }
}
