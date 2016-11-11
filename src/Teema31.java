/**
 * Created by Robert on 11.11.2016.
 */

import java.util.Random;
import java.util.Scanner;

public class Teema31{
    public static void main(String[] args){
        Random rand = new Random();
        int ns = rand.nextInt(100) + 1;
        int nus = 0;
        Scanner input = new Scanner(System.in);
        int Guess;
        boolean win=false;
        while(win == false)
            System.out.println("Guess a number between 1 to 100:  ");
        Guess=input.nextInt();
        nus++;
        if (Guess == nus) { win=true;

        }else if (Guess<ns ) {System.out.println("Wrong, you were off by "+(ns-Guess));  }
        else if (Guess>ns ) {System.out.println("Wrong, you were off by "+(Guess-ns));  }
       }
}



















