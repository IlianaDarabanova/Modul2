package com.company.Dijkstra;

import java.awt.*;

public class Dijkstra {
    private static final int GRAPH_SIZE = 8;
    private static int[][] graph;

    public static int[] dijkstra(int x){
        int[] result = new int[GRAPH_SIZE];
        boolean[] usedNodes  = new boolean[GRAPH_SIZE];
        for(int i = 0; i < GRAPH_SIZE;i++){
            result[i] = Integer.MAX_VALUE;
            usedNodes[i] = false;
        }
        result[x] = 0;

        boolean hasUnusedNodes = true;

        while(hasUnusedNodes){
            for(int i = 0; i<GRAPH_SIZE;i++){

            }
        }

        return result;
    }
}
