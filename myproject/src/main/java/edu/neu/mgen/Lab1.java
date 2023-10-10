package edu.neu.mgen;
import java.util.ArrayList;
/**
 * @author Yunfei Peng
 * studentID 002772958
 * INFO5100 Lab1
 */

public class Lab1 
{
    public static void main( String[] args )
    {
        /**
         * Part1 Array
         * Initiate two integer arrays, x, and y, each containing 5 numbers.
         * Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
         * Organize a nice-looking output to the terminal that looks like the following:
         * Array x = { array x values here separated by coma }
         * Array y = { array y values here separated by coma }
         * Array z = x + y = { array z values here separated by coma }
         *
         */
        int[] x = {0,1,2,3,4};
        int[] y = {2,6,-1,0,4};
        int[] z = new int[5];
        for(int i=0; i<5; i++){
            z[i] = Math.max(x[i], y[i]);
        }
        System.out.println("Part1: ");
        System.out.print("Array x = {" + x[0]);
        for(int k=1; k<5; k++){
            System.out.print(", " + x[k]);
        }
        System.out.println("}");

        System.out.print("Array y = {" + y[0]);
        for(int k=1; k<5; k++){
            System.out.print(", " + y[k]);
        }
        System.out.println("}");

        System.out.print("Array z = x + y = {" + z[0]);
        for(int k=1; k<5; k++){
            System.out.print(", " + z[k]);
        }
        System.out.println("}");
        System.out.println();

        /**
         * Part2 ArrayList
         * Initiate an ArrayList that contain 5 names
         * Switch the first and last letters in each name in the ArrayList. Do not forget that each name begins with 
         * a capital letter, but the other letters are lowercase. The names with switched letters should follow the 
         * same rule as there are new names.Organize a nice-looking output to the terminal that looks like the 
         * following:
         * Names = { list of names here separated by coma }
         * Names (switched) = { list of names with switched first and last letters here separated by coma }
         */
        ArrayList<String> names = new ArrayList<String>();        
        ArrayList<String> swithched_names = new ArrayList<String>();

        names.add("Tom");        
        names.add("Steve");
        names.add("John");
        names.add("Mark");
        names.add("Peter");

        // switch the first and last letters
        for(int i=0; i<names.size(); i++){
            String name = names.get(i);

            char first = name.charAt(0);
            char last = name.charAt(name.length() - 1);

            char[] switched_name = name.toCharArray();
            switched_name[0] = Character.toUpperCase(last);
            switched_name[switched_name.length-1] = Character.toLowerCase(first);
            String switched = new String(switched_name);
            // System.out.println(switched);
            swithched_names.add(switched);
        }

        System.out.println("Part2: ");
        System.out.print("Names = {" + names.get(0));
        for(int i=1; i<names.size(); i++){
            System.out.print(", " + names.get(i));
        }
        System.out.println("}");

        System.out.print("Names (switched) = {" + swithched_names.get(0));
        for(int i=1; i<names.size(); i++){
            System.out.print(", " + swithched_names.get(i));
        }
        System.out.println("}");
        System.out.println();

    }
}
