/*
 * *** BEATRIZ SANTOS / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    //create temp sets for a and b
    TreeSet<Integer> temp = new TreeSet<>();
    TreeSet<Integer> temp2 = new TreeSet<>();
    temp.addAll(setA);
    temp2.addAll(setB);
    // get intersection of a and b (A + B)
    temp2.retainAll(temp);
    // remove elements in B from A (only A)
    setA.removeAll(temp2);
    // remove elements in A from B (only B)
    setB.removeAll(temp2);
    // add only A and only B, not their intersection
    setA.addAll(setB);


    return setA; //setA
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    /*
     1. create an iterator to remove elements while iterating through the tree
     2. while there are keys in the key set, if the key is even, remove that key
     */
    Iterator<Integer> iter = treeMap.keySet().iterator();

    while (iter.hasNext()){
      Integer key = iter.next();
      if (key % 2 == 0){
        iter.remove();
      }
    }

    return;

  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    /*
     1. if tree1 is equal to tree2 return true, else return false. (.equals() method does this)
     */

    if (tree1.equals(tree2)){
      return true;
    }
    return false;

  }

} // end treeProblems class
