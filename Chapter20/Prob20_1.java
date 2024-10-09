package Chapter20;

import java.util.Random;
import java.util.Scanner;

public class Prob20_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Random rand = new Random();
        
        for(int i = 0; i < 10; i++){
            int num = rand.nextInt(num2);
            if(num >= num1){
                System.out.println(num);
            }
            else{
                i--;
            }
        }

    }
}
