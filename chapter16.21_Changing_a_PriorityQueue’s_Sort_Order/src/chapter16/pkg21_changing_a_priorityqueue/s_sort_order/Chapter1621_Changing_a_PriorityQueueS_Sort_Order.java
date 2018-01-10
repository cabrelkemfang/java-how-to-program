/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter16.pkg21_changing_a_priorityqueue.s_sort_order;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Admin
 */
public class Chapter1621_Changing_a_PriorityQueueS_Sort_Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
   {
      // queue of capacity 11
      PriorityQueue<Double> queue = new PriorityQueue<>();

      // insert elements to queue
      queue.offer(3.2);
      queue.offer(9.8);
      queue.offer(5.4);

      System.out.print("Polling from queue: ");
        List<Double> LinkedList;
      //Collections.reverseOrder((Comparator<T>) queue);
List <Double> list = new LinkedList<>();
      // display elements in queue
      while (queue.size() > 0)
      {
         //System.out.printf("%.1f ", queue.peek()); // view top element
       list.add(queue.peek()); 
          
         queue.poll(); // remove top element
      } 
      
      Collections.reverse(list);
      System.out.println(list);
   } 
    
}
