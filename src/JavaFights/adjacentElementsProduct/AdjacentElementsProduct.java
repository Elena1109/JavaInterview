package JavaFights.adjacentElementsProduct;

/**
 Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

 Example

 For inputArray = [3, 6, -2, -5, 7, 3], the output should be
 adjacentElementsProduct(inputArray) = 21.

 7 and 3 produce the largest product.

 Input/Output

 [time limit] 3000ms (java)
 [input] array.integer inputArray

 An array of integers containing at least two elements.

 Constraints:
 2 ≤ inputArray.length ≤ 10,
 -1000 ≤ inputArray[i] ≤ 1000.

 [output] integer

 The largest product of adjacent elements.
 */
public class AdjacentElementsProduct {
    public static int adjacentElementsProduct(int[] inputArray) {
        int max= max=inputArray[0]*inputArray[1];
        for(int i=1; i<inputArray.length-1; i++){
            if (inputArray[i]*inputArray[i+1]>max){
                max=inputArray[i]*inputArray[i+1];
            }
            }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, -2, -5, 7, 3};
        System.out.println(adjacentElementsProduct(arr));
    }
}
