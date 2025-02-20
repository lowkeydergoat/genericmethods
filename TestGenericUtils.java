import java.util.Arrays;

public class TestGenericUtils {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"yousef sheikho", "fabian heler", "lukas hecher", "maroi milkov", "testy man"};
        GenericUtils.reverse(strArray);
        System.out.println(Arrays.toString(strArray));
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println(GenericUtils.sum(doubleArray));

        Integer[] integerArray = {10, 20, 30};
        System.out.println(GenericUtils.sum(integerArray));
    }
}