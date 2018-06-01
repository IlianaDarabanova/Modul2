package darabanova.iliana.Tasks.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DailyTemperaturesITERATIVE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] temperatures = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.stream(dailyTemperatures(temperatures)).forEach(x-> System.out.printf("%d ",x));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] daysLeft = new int[temperatures.length];
        int counter = 0;
        boolean hasWarmerDay = false;
        for(int i = 0;i<temperatures.length-1;i++){
            hasWarmerDay = false;
            counter = 0;
            for(int k =i+1;k<temperatures.length;k++){
                counter++;
                if(temperatures[i]<temperatures[k]){
                  hasWarmerDay = true;
                    break;
                }

            }
            if(hasWarmerDay){
            daysLeft[i] = counter;}
            else daysLeft[i] = 0;
        }
        return daysLeft;
    }

}
