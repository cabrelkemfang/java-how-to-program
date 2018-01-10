/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapte16.pkg16_countin_.duplicate_words;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Chapte1616_Countin_Duplicate_Words {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }

    // create map from user input

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        String[] tokens = input.split(" ");

        // processing input text
        for (String token : tokens) {

            String word = token.toLowerCase(); // get lowercase word
            int count = 0;
            // if the map contains the word
            if (map.containsKey(word)) // is word in map
            {
                count = map.get(word);
                map.put(word, count + 1);

            } else {
                map.put(word, 1);

            }
        }
        for (String value1 : map.keySet()) {
            if (map.get(value1) == 1) {
                map.remove(value1);
                //System.out.println("ok");
            }
        }

    }

    // display map content
    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
