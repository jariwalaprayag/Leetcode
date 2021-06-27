class Graph {  
    public final int V;
    public final List<List<Integer>> adj;
    public Graph(int V)
    {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }
    public boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack)
    {
        if (recStack[i])
            return true;
        if (visited[i])
            return false;
        visited[i] = true;
        recStack[i] = true;
        List<Integer> children = adj.get(i);
        for (Integer c: children)
            if (isCyclicUtil(c, visited, recStack))
                return true;
        recStack[i] = false;
        return false;
    }
    public void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }
    public boolean isCyclic(){
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;
        return false;
    }
}

class Solution { 
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <= 1) return true;
        Graph graph = new Graph(numCourses);
        for(int i = 0; i < prerequisites.length; i++)
            graph.addEdge(prerequisites[i][1], prerequisites[i][0]);
        if(graph.isCyclic())
            return false;
        return true;
    }
}