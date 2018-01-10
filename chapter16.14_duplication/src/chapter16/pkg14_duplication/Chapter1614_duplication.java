/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter16.pkg14_duplication;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chapter1614_duplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create and display a List<String>
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        String [] Scolor={};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        // eliminate duplicates then print the unique values
        Set<String> set = new HashSet<>(list);
        System.out.println("Non duplicated are :");
        //Collections.copy(set,list);
        for (String value : set) {
            System.out.printf("%s", value);
            System.out.println();
           
         
        }
        
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter a string ");
        String input = scanner.nextLine();
        int result = Collections.binarySearch(list, input);
        if (result > 0) {
            System.err.println("the Name " + input + " is found at position :" + result);
        } else {
            System.err.println("the Name " + input + " is not found");
        }

    }
}
