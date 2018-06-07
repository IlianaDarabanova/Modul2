package darabanova.iliana.Tasks.Stack;

import java.util.Scanner;
import java.util.Stack;

public class CokiSkoki {
    public static void main(String[] args){
        int[] building = readBuildings();
        int[] maxSkoks = new int[building.length];

        Stack<Integer> peeks = new Stack<>();
        for(int i = building.length-1;i>=0;i--)
            while(!peeks.isEmpty() && peeks.peek()<=building[i]){

            }
    }

    public static int[] readBuildings(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] buildings = new int[n];
        for(int i = 0;i<n;i++){
            buildings[i] = in.nextInt();
        }
        return buildings;
    }
}
