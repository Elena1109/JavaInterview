package JavaFights.makeArrayConsecutive2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
 each statue having an non-negative integer size. Since he likes to make things perfect,
 he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
 He may need some additional statues to be able to accomplish that.
 Help him figure out the minimum number of additional statues needed.

 Example

 For statues = [6, 2, 3, 8], the output should be
 makeArrayConsecutive2(statues) = 3.

 Ratiorg needs statues of sizes 4, 5 and 7.

 Input/Output

 [time limit] 3000ms (java)
 [input] array.integer statues

 An array of distinct non-negative integers.

 Constraints:
 1 ≤ statues.length ≤ 10,
 0 ≤ statues[i] ≤ 20.

 [output] integer

 The minimal number of statues that need to be added to existing statues such
 that it contains every integer size from an interval [L, R] (for some L, R) and no other sizes.
 */
public class MakeArrayConsecutive2 {
    public static void main(String[]args)throws Exception{
        int mas[]={6, 2, 3, 9};
        System.out.println(makeArrayConsecutive2(mas));
    }
    public static int makeArrayConsecutive2(int[] statues) {
//        int min=statues[0];
//        int max=statues[0];
//        for(int i=0; i<statues.length; i++){
//            if(statues[i]<min){
//                min=statues[i];
//            }
//            if(statues[i]>max){
//               max=statues[i];
//            }
//
//
//        }
//        int raznitsa=max-min-statues.length+1;
//return raznitsa;
        Arrays.sort(statues);// сортировка от минимального к максимальному
        return statues[statues.length-1] - statues[0] - statues.length + 1;
    }
}
