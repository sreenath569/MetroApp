package com.example.metroapp;


public class Pair implements Comparable<Pair>{

    int v;
    int w;

    Pair(int v, int w){
        this.v = v;
        this.w = w;
    }

    public int compareTo(Pair that){
        return this.w-that.w;
    }
}
