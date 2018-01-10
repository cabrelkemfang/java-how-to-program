/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap16.pkg17_inserting_elements_in_a_.linkedlist_in_sorted_order;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Chap1617_Inserting_Elements_in_a_LinkedList_in_Sorted_Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 25; i++) {

            list.add(rand.nextInt(100));
        }
        Collections.sort(list);
        System.out.println("The 25 randon number are:"+list);
        int sum =0;
        for(Integer value:list){
            sum= sum +value;  
        }
        double average=sum/25;
        System.out.println("The sum is :"+sum);
        System.out.println("The average is :"+average);
    }

}
