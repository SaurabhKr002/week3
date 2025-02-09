package datastructuressearchingcomparision;

import java.util.List;
import java.util.HashSet;
import java.util.TreeSet;

public class SearchAlgorithms {
    public static long measureArraySearch(List<Integer> list, int value) {
        long startTime = System.nanoTime();
        boolean found = list.contains(value);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000; // Convert to microseconds
    }

    public static long measureHashSetSearch(HashSet<Integer> set, int value) {
        long startTime = System.nanoTime();
        boolean found = set.contains(value);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000; // Convert to microseconds
    }

    public static long measureTreeSetSearch(TreeSet<Integer> set, int value) {
        long startTime = System.nanoTime();
        boolean found = set.contains(value);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000; // Convert to microseconds
    }
}
