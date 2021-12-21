package standard.classes.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulerExpression {
    /*
        Regular Expression atau disingkat regex adalah cara
        untuk melakukan pola pencarian

        Biasanya dilakukan untuk pencarian dalam data String

        Regex adalah pencarian yang lebih advanced
        dibanding pencarian text biasanya, misal kita ingin
        mencari semua kata yang mengandung diawali huruf a
        dan diakhiri huruf a, dan lain-lain
     */

    /*
        Java sudah menyediakan package java.util.regex yang
        berisikan utilitas untuk melakukan proses regular
        expression

        Secara garis besar terdapat 2 class yang dapat kita
        gunakan, yaitu Pattern class dan Matcher class

        Pattern class adalah representasi hasil kompilasi
        dari pola regular expression yang kita buat

        Matcher class adalah engine untuk melakukan
        pencarian dari pattern yang sudah kita buat

        doc:
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/regex/Pattern.html
     */
    public static void main(String[] args) {
        String name = "Muhammad Ismail bin Mail";

        //Pattern Class
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        //Matcher Class
        Matcher matcher = pattern.matcher((name));

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
