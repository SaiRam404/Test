import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    public static void main(String[] args) {
        int[][] graph = {
            {1, 2},
            {0, 3, 4},
            {0, 4},
            {1},
            {1, 2}
        };

        bfs(graph, 0);
    }

    public static void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
