public class GenericUtils {

    /**
     * Reverses the elements of the array.
     *
     * @param <T>   generic elements in the array
     * @param array the array to be reversed
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of all elements in the array.
     * The array must contain numbers.
     *
     * @param <T>   the type of elements in the array, must be a number
     * @param array the array of numbers to sum of
     * @return the sum of the elements as a double
     */
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].doubleValue();
        }
        return total;
    }
}