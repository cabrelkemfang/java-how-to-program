/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter16.pkg18_copying_and_reversing_linkedlists;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Chapter1618_Copying_and_Reversing_LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner

        List<String> list1 = new LinkedList < > ();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a string:"); // prompt for user input
            String input = scanner.nextLine();
            list1.add(input);
        }
        System.out.println("the list1 :"+list1);
        System.out.println();
       
        Collections.reverse(list1);
         System.out.println("the list1 in reverse order :"+list1);
        List<String> list2 = new LinkedList<>();
        //Collections.copy(list2, list1);
        list2.addAll(list1);
        System.out.println("the second list is :"+list2);
    }

}
