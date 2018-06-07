package junk.lds.map;

import java.util.HashMap;
import java.util.Scanner;

public class OddNumber {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        HashMap<Long,Long> nums = new HashMap<>();
        for(int i = 0;i<N;i++){
            Long num = scan.nextLong();
            if(!nums.containsKey(num)){
                nums.put(num,1L);

            }
            else{
                long value = nums.get(num);
                value++;
                nums.replace(num,value);

            }
        }

        for(long key : nums.keySet()){
            if(nums.get(key)%2!=0){
                System.out.println(key);
                break;
            }
        }
    }


}
