package darabanova.iliana.Tasks.dsaExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Packages {
    public void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        for(int i = 0;i<m;i++){
            int from = scan.nextInt();
            int to = scan.nextInt();
            if(!graph.keySet().contains(from)){
                graph.put(from,new ArrayList<>());
            }

            graph.get(from).add(to);

        }


    }
}
