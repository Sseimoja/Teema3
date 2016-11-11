/**
 * Created by Robert on 11.11.2016.
 */
import java.util.Scanner;
public class teema3 {public static void main(String[] args) {
    double C;
    int feet, Fahrenheit ;
    final double C_PER_F =1.8 ;

    Scanner in = new Scanner(System.in);
    System.out.print("Exactly how many Celsius? ");
    C = in.nextDouble();
    Fahrenheit = (int) (C*C_PER_F+32);
    System.out.printf("%.2f C = %d F ",
            C, Fahrenheit);



}}
