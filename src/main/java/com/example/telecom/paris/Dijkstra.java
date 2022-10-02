package com.example.telecom.paris;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dijkstra {
    public static void main(String[] args) {

        Scanner scan = null;
        try {
            scan = new Scanner(new File("/root/IdeaProjectsTP/tp05Dijkstra/src/main/resources/file/10_Random.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // read the first two numbers in the file for the size of the array
        int numberRows = 7;
        int numberColumns = 7;

        int[][] graph = new int[numberRows][numberColumns];
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColumns; j++) {
                graph[i][j] = Integer.parseInt(String.valueOf(scan.next().charAt(0)));
            }
        }

        System.out.print("Matrice du fichier => ");
        System.out.println();

        for (int k = 0; k < graph.length; k++) {
            for (int s = 0; s < graph[k].length; s++) {
                System.out.print(graph[k][s] + " ");
            }
            System.out.println();
        }
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
    }
}


