package standard.classes.NumberClass;

public class String_to_Number {
    /*
        Long, Integer, Short dan Byte memiliki static method
        untuk melakukan konversi dari String ke number

        parseXxx(string) digunakan untuk mengkonversi dari string
        ke tipe data number primitif

        valueOf(string) digunakan untuk mengkonversi dari string
        ke tipe data number non primitif

        Method ini akan throw NumberFormatException jika ternyata
        gagal melakukan konversi String ke number
     */
    public static void main(String[] args) {
        String angkaString = "1200"; /* Jika string nya bukan angka,
                                        akan langsung error
                                     */

        // konversi ke tipe data primitif
        int angka_int = Integer.parseInt(angkaString);
        double angka_double = Double.parseDouble(angkaString);

        // konversi ke tipe data not-primitif
        Integer angkaInteger = Integer.valueOf(angkaString);
        Double angkaDouble = Double.valueOf(angkaString);

    }
}
