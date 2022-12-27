package com.example.metroapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class GraphMetro {

    ArrayList<ArrayList<ArrayList<Integer>>> metroGraph = new ArrayList<>();
    MetroNodes metroNodes = new MetroNodes();
    public void addNodesIntoGraph(){

        metroNodes.addGraphNodes();
        metroGraph = metroNodes.metroGraph;
    }
    public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        int[] shortestPath = new int[V];
        for(int i=1 ; i<V ; i++){
            shortestPath[i] = Integer.MAX_VALUE;
        }
        boolean[] visited = new boolean[V];

        PriorityQueue<Pair> q = new PriorityQueue<>();

        q.add(new Pair(S,0));
        shortestPath[S] = 0;

        while(q.size()!=0){
            Pair cur = q.remove();
            int u = cur.v;

            if(visited[u]){
                continue;
            }

            visited[u] = true;
            ArrayList<ArrayList<Integer>> neighbours = adj.get(u);
            for(ArrayList<Integer> list : neighbours){
                int vertex = list.get(0);
                int weight = list.get(1);

                if(shortestPath[vertex] > shortestPath[u]+weight){
                    shortestPath[vertex] = shortestPath[u]+weight;
                    q.add(new Pair(vertex, shortestPath[vertex]));
                }
            }
        }
        return shortestPath;
    }
    public static void main(String[] args){

        GraphMetro graphMetro = new GraphMetro();
        graphMetro.addNodesIntoGraph();



        int[] shortestPath  = graphMetro.dijkstra(graphMetro.metroGraph.size(), graphMetro.metroGraph, 1);

       // System.out.print(graphMetro.metroGraph.size());
        for(int i=1 ; i<shortestPath.length ; i++){
            System.out.print(shortestPath[i]+" ");
        }
    }

}
