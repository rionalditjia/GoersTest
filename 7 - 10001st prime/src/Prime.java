
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIO BULL
 */
public class Prime {
    public static void main(String[] args) {

        int counter = 1;
        int number = 1;
        int prime = 0;
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        
        while (counter <= input) {
            if (number == 2) {
                counter++;
                prime = number;
            } else if (number % 2 == 1 && number != 1) {
                int primeChecker = 0;
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        primeChecker++;
                    }
                }
                if (primeChecker == 2) {
                    counter++;
                    prime = number;
                }
            }
            number++;
        }
        System.out.println(prime);
    }
}
