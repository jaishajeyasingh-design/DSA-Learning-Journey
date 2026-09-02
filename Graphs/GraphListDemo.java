package Graphs;
import java.util.*;
public class GraphListDemo {
    static List<List<Integer>> L=new LinkedList<>();
    static int v=5;
    public static void main(String[] args){
        System.out.println(L);
        for(int i=0;i<v;i++){
            L.add(new LinkedList<>());
        }
        System.out.println(L);
        add(0,1);
        add(0,2);
        add(1,3);
        add(2,3);
        add(1,4);
        add(3,4);
        System.out.println(L);
        bfs(0);
        boolean[] visited=new boolean[v];
        dfs(0,visited);
    }
    static void add(int s,int d){
        L.get(s).add(d);
        L.get(d).add(s);
    }
    static void bfs(int start){
        boolean visited[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.offer(start);
        while(!q.isEmpty()){
            int temp=q.poll();
            System.out.print(temp+" ");
            for(int i:L.get(temp)){
                if(visited[i]==false){
                    q.offer(i);
                    visited[i]=true;
                }
            }
        }
    }
    static void dfs(int start,boolean visited[]){
        visited[start]=true;
        System.out.println(start+" ");
        for(int i:L.get(start)){
            if(!visited[i]){
                dfs(i,visited);
            }
        }
    }
}
