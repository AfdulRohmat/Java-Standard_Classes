package standard.classes.ArraysClass;

import java.util.Arrays;

public class Arrays_Class {
    /*
        Arrays class adalah class yang berisikan static
        method yang bisa kita gunakan untuk memanipulasi
        data array, seperti pencarian dan pengurutan

        doc:
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html
     */

    public static void main(String[] args) {
        int[] numbers = {3, 5, 89, 91, 2, 19, 189, 291};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 2));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 7);
        System.out.println(Arrays.toString(result2));

        // dan masih banyak lagi...



    }
}
