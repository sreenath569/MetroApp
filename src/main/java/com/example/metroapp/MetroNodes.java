package com.example.metroapp;

import java.util.ArrayList;

public class MetroNodes {

    ArrayList<ArrayList<ArrayList<Integer>>> metroGraph = new ArrayList<>();

    public void addGraphNodes(){

        int noOfNodes = 4;
        for(int i=0 ; i<=noOfNodes ; i++){
            metroGraph.add(new ArrayList<ArrayList<Integer>>());
        }

        ArrayList<Integer> neighbour;

        //add neighbours of 1st node
        neighbour = new ArrayList<>();
        neighbour.add(2);
        neighbour.add(1);
        metroGraph.get(1).add(neighbour);

        //add neighbours of 2nd node
        neighbour = new ArrayList<>();
        neighbour.add(1);
        neighbour.add(1);
        metroGraph.get(2).add(neighbour);
        neighbour = new ArrayList<>();
        neighbour.add(3);
        neighbour.add(1);
        metroGraph.get(2).add(neighbour);

        //add neighbours of 3rd node
        neighbour = new ArrayList<>();
        neighbour.add(2);
        neighbour.add(1);
        metroGraph.get(3).add(neighbour);
        neighbour = new ArrayList<>();
        neighbour.add(4);
        neighbour.add(1);
        metroGraph.get(3).add(neighbour);

        //add neighbours of 4th node
        neighbour = new ArrayList<>();
        neighbour.add(3);
        neighbour.add(1);
        metroGraph.get(4).add(neighbour);
        /*neighbour = new ArrayList<>();
        neighbour.add(5);
        neighbour.add(1);
        metroGraph.get(4).add(neighbour);*/


    }
}
