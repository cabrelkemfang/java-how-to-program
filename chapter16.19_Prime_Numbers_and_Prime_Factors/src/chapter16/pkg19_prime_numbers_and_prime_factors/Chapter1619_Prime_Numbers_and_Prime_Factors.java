/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter16.pkg19_prime_numbers_and_prime_factors;

import static java.lang.Integer.parseInt;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chapter1619_Prime_Numbers_and_Prime_Factors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number:"); // prompt for user input
            int input = parseInt(scanner.nextLine());

            list.add(input);
        }
        for (Integer value : list) {
            if (value == 2 || value == 3 || value == 5 || value == 7) {
                System.out.println("the number :" + value + " is prime");
            } else if (value % 2 != 0 && value % 3 != 0 && value % 5 != 0 && value % 7 != 0) {
                System.out.println("the number :" + value + " is prime");
            }else{
                 System.out.println("the number :" + value + " is not prime");
                 for(int i=2;i<=9;i++ ){
                if(value%i==0){
                    if(value==i){
                        continue;
                    }
                    list2.add(i);
                }else{
                    continue;
                }
                System.out.println("the factor of :"+value+" are:"+list2);
                
            }
            }
        }

    }

}
