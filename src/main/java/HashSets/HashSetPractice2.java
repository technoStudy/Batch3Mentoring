package HashSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice2 {

/*
Write a method whose name is firstHasAllSecond
it takes two HashSet<Character> (say, chrSet1 and chrSet2) as parameters
it checks if the first HashSet has all the elements of the second HashSet
if so, it returns true, else returns false
 */

    public static boolean firstHasAllSecond(HashSet<Character> chrSet1, HashSet<Character> chrSet2) {
        boolean result = true;

        for (Character chr : chrSet2) {
            if (!chrSet1.contains(chr)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        HashSet<Character> chrSet1 = new HashSet<>();
        chrSet1.add('1');
        chrSet1.add('a');
        chrSet1.add('@');
        chrSet1.add('D');

        HashSet<Character> chrSet2 = new HashSet<>();
        chrSet2.add('1');
        chrSet2.add('a');
        chrSet2.add('8');


        System.out.println(firstHasAllSecond(chrSet1,chrSet2));

    }


}
