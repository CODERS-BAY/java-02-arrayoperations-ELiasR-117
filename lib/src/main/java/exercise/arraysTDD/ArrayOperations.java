package exercise.arraysTDD;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
        int x=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[j-1]){
                    x = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = x;
                }
            }
        }
        return numbers;
    }

    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
        int x=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length-2; j>=0; j--) {
                if(numbers[j] < numbers[j+1]){
                    x = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = x;
                }
            }
        }
        return numbers;
    }
    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
        int[] arr = new int[unsorted.length];
        int x = 0;
        for (int i = unsorted.length-1; i >= 0 ; i--) {
            arr[x]=unsorted[i];
            x++;

        }
        return arr;

    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value) {
                return true;
            }
        }
        return false;
    }
    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double sum = 0;
        double avrg = 0;
        for (int elem : numbers) {
            sum+= elem;
        }
        return sum / numbers.length;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(maxValue < numbers[i]){
                maxValue = numbers[i];
            }
        }
        double sum = 0;
        double x = 0;
        for (int elem : numbers) {
            sum+= elem;
        }
        x = maxValue + minValue;
        sum = sum - x;

        return sum / (numbers.length-2);
    }





    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(maxValue < numbers[i]){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        int minValue = numbers[0];
        for (int i= 0; i < numbers.length; i++) {
            if(minValue > numbers[i]){
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int someHelper(int[] tmp) {
        return 1;
    }
}
