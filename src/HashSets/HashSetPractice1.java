package HashSets;

// What is the main difference between an ArrayList and a HashSet?


import java.util.*;

public class HashSetPractice1 {

     /*
    given an ArrayList<Integer>
    check if contains any repeated element
    print on the console "At least one element is repeating." or "No element repeats." accordingly
    */

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(120);
        numList.add(1);
        numList.add(14);
        numList.add(10);
        numList.add(9);

        Set<Integer> numSet = new LinkedHashSet<>(numList);

//        for (int i = 0; i < numList.size(); i++) {
//            numSet.add(numList.get(i));
//        }
//
//        for (Integer element : numList) {
//            numSet.add(element);
//        }

//        numSet.addAll(numList);

        System.out.println("ArrayList is here --->" + numList);
        System.out.println("LinkedHashSet is here --->" + numSet);

        if (numSet.size() == numList.size()) {
            System.out.println("No element repeats.");
        } else {
            System.out.println("At least one element is repeating.");
        }


        System.out.println("----------Exercise 2-----------\n");
        /*
    given an array of Integer[]
    check if contains any repeated element
    print on the console "At least one element repeating." or "No element repeats." accordingly
    */

        Integer[] numArr = new Integer[]{25, 15, 0, -8, 225};
        List numList2 = new ArrayList();
        numList2 = Arrays.asList(numArr);
        Set<Integer> numSet2 = new HashSet<>(numList2);
        if (numSet2.size() == numArr.length) {
            System.out.println("No element repeats.");
        } else {
            System.out.println("At least one element is repeating.");
        }


    }


}
