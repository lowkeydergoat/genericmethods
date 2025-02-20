public class GenericUtils {
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
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].doubleValue();
        }
        return total;
    }
}