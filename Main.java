package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String str) {
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        str = str.replaceAll("[^a-zA-Z0-9\\s+]", "");
        str = str.replace(" ", "");
        String lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            queue.addLast(lower.charAt(i));
            stack.push(lower.charAt(i));
        }


        for (int i = 0; i < lower.length(); i++)
            if (queue.removeFirst() != stack.pop())
                return false;

            return true;



    }




    }




