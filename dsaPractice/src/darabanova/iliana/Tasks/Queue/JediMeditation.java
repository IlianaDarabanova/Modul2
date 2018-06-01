package darabanova.iliana.Tasks.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class JediMeditation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String[] jedis = reader.readLine().split(" ");
        jediSort(jedis);
    }

    public static void jediSort(String[] jedis){
        Queue<String> mJedis = new LinkedList<>();
        Queue<String> kJedis = new LinkedList<>();
        Queue<String> pJedis = new LinkedList<>();

        for(String sJedi : jedis){
            if(sJedi.charAt(0)=='M'){
                mJedis.offer(sJedi);
            }
            else if(sJedi.charAt(0)=='K'){
                kJedis.offer(sJedi);
            }
            else {
                pJedis.offer(sJedi);
            }
        }

        printQueue(mJedis);
        printQueue(kJedis);
        printQueue(pJedis);

    }

    public static void printQueue(Queue<String> queue){
        while(!queue.isEmpty()){
            String str = queue.poll();
            System.out.printf("%s ",str);
        }
    }
}
