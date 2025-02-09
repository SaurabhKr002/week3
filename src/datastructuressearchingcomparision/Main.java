package datastructuressearchingcomparision;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 100000, 1000000};
        int searchValue = -1; // Value not in dataset to simulate worst-case scenario

        System.out.println("Comparing Different Data Structures for Searching:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s | %-20s | %-20s | %-20s%n",
                "Dataset Size (N)", "Array Search (O(N))", "HashSet Search (O(1))", "TreeSet Search (O(log N))");
        System.out.println("--------------------------------------------------------------------------");

        for (int size : datasetSizes) {
            List<Integer> arrayList = new ArrayList<>();
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < size; i++) {
                int num = i;
                arrayList.add(num);
                hashSet.add(num);
                treeSet.add(num);
            }

            long arrayTime = SearchAlgorithms.measureArraySearch(arrayList, searchValue);
            long hashSetTime = SearchAlgorithms.measureHashSetSearch(hashSet, searchValue);
            long treeSetTime = SearchAlgorithms.measureTreeSetSearch(treeSet, searchValue);

            System.out.printf("%-15d | %-20dμs | %-20dμs | %-20dμs%n",
                    size, arrayTime, hashSetTime, treeSetTime);
        }
    }
}
