package com.company;

public class ArrayFunReverseIt {

    public static void main(String[] args) {

        //declare originalArray [1,2,3,4,5]
        int[] originalArray = {1,2,3,4,5};
            System.out.println("This is the original order of the array.");

        //declare reverse of originalArray
        int[] reverseReverse = new int[5];

        //use enhanced for loop to print originalArray
        for (int element: originalArray) {
            System.out.println(element);
        }

        //display user input
        System.out.println("\n" + "This is the reverse order.");

        //use for loop to print reverseReverse
        for (int i = 0; i < originalArray.length; i++) {
            reverseReverse[i] = originalArray[originalArray.length - 1 - i];
            System.out.println(reverseReverse[i]);
        }

    }
}
