package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	final int NUMBER_OF_STRING = 20;
    	final Set <String> set = new TreeSet <>();
    	
    	for (int i = 1; i <= NUMBER_OF_STRING; i++) {
    		set.add(String.valueOf(i));
    	}
    	
    	System.out.println(set.toString());
    	
    	Iterator <String> iterator = set.iterator();
    	while(iterator.hasNext()) {
    		if(Integer.valueOf(iterator.next()) % 3 == 0) {
        		iterator.remove();
    		}
    	}
    	
    	for(String s : set) {
    		System.out.println(s);
    	}
    	
    	boolean even = true;
    	for(String s : set) {
    		if (Integer.valueOf(s) % 2 != 0) {
    			even = false;
    			break;
    		}
    	}
		System.out.println("The number "+ (even ? "are" : "aren't") + "even");
    }
}
