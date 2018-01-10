/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter16.pkg20_sorting_words_with_a_treeset;

import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Chapter1620_Sorting_Words_with_a_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        System.out.println("Enter a number:"); // prompt for user input
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(tokens));
        for(String value:tree){
            System.out.println("the value is :"+value);
            System.out.println();
        }
    }

}
