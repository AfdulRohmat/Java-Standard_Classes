package standard.classes.NumberClass;

public class Number_Class {
    /*
        Semua number class yang bukan primitif memiliki parent
        class yang sama, yaitu class Number

        Class number memiliki banyak method yang bisa digunakan
        untuk mengkonversi ke tipe number lain

        Hal ini memudahkan kita untuk mengkonversi object number
        dari satu tipe ke tipe number lainnya
     */
    public static void main(String[] args) {
        // Number untuk tipe data non primitif. Integer != int,
        // Double != double

        Integer intValue = 1000;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Byte byteValue = intValue.byteValue();
        Short shortValue = doubleValue.shortValue();
    }
}
