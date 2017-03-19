package JavaFights.almostIncreasingSequence;

import java.util.ArrayList;
import java.util.Arrays;

/**
 Given a sequence of integers as an array, determine whether it is possible
 to obtain a strictly increasing sequence by removing no more than one element from the array.

 Example

 For sequence = [1, 3, 2, 1], the output should be
 almostIncreasingSequence(sequence) = false;

 There is no one element in this array that can be removed in order to get a strictly increasing sequence.

 For sequence = [1, 3, 2], the output should be
 almostIncreasingSequence(sequence) = true.

 You can remove 3 from the array to get the strictly increasing sequence [1, 2].
 Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

 Input/Output

 [time limit] 3000ms (java)
 [input] array.integer sequence

 Constraints:
 2 ≤ sequence.length ≤ 105,
 -105 ≤ sequence[i] ≤ 105.

 [output] boolean

 Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence,
 otherwise return false.
 */
public class AlmostIncreasingSequence {
    public static void main(String[]args){
     int[]a={3,1,8,5};

        System.out.println(almostIncreasingSequence(a));
    }
 public static    boolean almostIncreasingSequence(int[] sequence) {
     int n=0;
     int max=Integer.MAX_VALUE;
     int wrongValue=Integer.MIN_VALUE;
     for(int i=0; i<sequence.length; i++){
         if(sequence[i]<=wrongValue||sequence[i]==max){
             n++;
         }
         if ((i-1 > -1)&&(sequence[i] <= sequence[i-1])) {
             max=sequence[i-1];
             if(i-2 > -1){
                 wrongValue=sequence[i-2];
             }
             n++;
         }

     }

     if(n==1 || n==0)
         return true;
     else
         return false;
    }
}
