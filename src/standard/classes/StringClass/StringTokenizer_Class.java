package standard.classes.StringClass;

import java.util.StringTokenizer;

public class StringTokenizer_Class {
    /*
        StringTokenizer class adalah class yang bisa digunakan
        untuk memotong String menjadi token atau string yang
        lebih kecil

        Kita bisa memotong String dengan delimiter yang kita mau

     */
    public static void main(String[] args) {
        // StringTokenizer
        String name = "Ismail bin Mail";
        StringTokenizer stringTokenizer = new StringTokenizer(
                name, " "
        );

        while (stringTokenizer.hasMoreTokens()){
            String hasilTokenizer = stringTokenizer.nextToken();
            System.out.println(hasilTokenizer);
        }
    }
}
