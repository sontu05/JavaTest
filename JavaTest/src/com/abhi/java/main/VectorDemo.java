package com.abhi.java.main;

import java.util.*;
public class VectorDemo {

   public static void main(String args[]) {
      // initial size is 3, increment is 2
      Vector<Number> v = new Vector<Number>(3, 2);
      System.out.println("Initial size: " + v.size());
      System.out.println("Initial capacity: " + v.capacity());
      
      v.addElement(Integer.valueOf(1));
      v.addElement(Integer.valueOf(2));
      v.addElement(Integer.valueOf(3));
      v.addElement(Integer.valueOf(4));
      System.out.println("Capacity after four additions: " + v.capacity());

      v.addElement(Double.valueOf(5.45));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(Double.valueOf(6.08));
      v.addElement(Integer.valueOf(7));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(Float.valueOf(9.4f));
      v.addElement(Integer.valueOf(10));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(Integer.valueOf(11));
      v.addElement(Integer.valueOf(12));
      System.out.println("First element: " + (Integer)v.firstElement());
      System.out.println("Last element: " + (Integer)v.lastElement());
      
      if(v.contains(Integer.valueOf(3)))
         System.out.println("Vector contains 3.");
         
      // enumerate the elements in the vector.
      Enumeration<Number> vEnum = v.elements();
      System.out.println("\nElements in vector:");
      
      while(vEnum.hasMoreElements())
         System.out.print(vEnum.nextElement() + " ");
      System.out.println();
      
      //iterate over the elements from the vector using foreach and 
      Iterator<Number> vecIt=v.iterator();
      vecIt.forEachRemaining(s -> {
    	  System.out.println("s ="+s);
      });
   }
}