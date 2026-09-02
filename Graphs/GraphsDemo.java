package Graphs;

import java.util.Arrays;

public class GraphsDemo {
    static int[][] m;
    public static void main(String[] args){
        int v=5;
        m=new int[v][v];
        
        for(int i=0;i<v;i++){
            System.out.println(Arrays.toString(m[i]));
        }
        add(0,1);
        add(0,2);
        add(1,3);
        add(2,3);
        add(1,4);
        add(3,4);
        System.out.println("---------");
        for(int i=0;i<v;i++){
            System.out.println(Arrays.toString(m[i]));
        }
    }
    public static void add(int s,int d){
        m[s][d]=1;
        m[d][s]=1;
    }
}
