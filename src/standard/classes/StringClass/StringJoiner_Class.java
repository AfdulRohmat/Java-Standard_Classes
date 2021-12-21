package standard.classes.StringClass;

import java.util.StringJoiner;

public class StringJoiner_Class {
    /*
        StringJoiner adalah class yang bisa digunakan untuk
        membuat String sequence yang dipisahkan dengan delimiter

        StringJoiner juga mendukung prefix dan suffix jika kita
        ingin menambahkannya

        Ini sangat bagus ketika ada kasus misal kita ingin
        mem-print Array dengan format yang kita mau misalnya

     */
    public static void main(String[] args) {
        //StringJoiner
        StringJoiner stringJoiner = new StringJoiner(
                ", ", "[", "]"
        );

        stringJoiner.add("Afdul");
        stringJoiner.add("Rohmat");

        String fullname = stringJoiner.toString();

        System.out.println(fullname);
    }
}
