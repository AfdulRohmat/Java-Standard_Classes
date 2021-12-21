package standard.classes.Base64Class;

import java.util.Base64;

public class Base64_Class {
    /*
        class untuk melakukan encoding base64

        Base64 adalah encoding yang bisa digunakan untuk
        mengubah binary data ke text yang aman dari kesalahan
        parsing

        doc:
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Base64.html
        https://www.ietf.org/rfc/rfc4648.txt
     */
    public static void main(String[] args) {

        String teksAsli = "Muhammad Ismail bin Mail";

        // encode data ke Base64
        String encoded_teksAsli = Base64.getEncoder().encodeToString(teksAsli.getBytes());
        System.out.println(encoded_teksAsli);

        // decode Base64 ke data awalnya
        byte[] bytes = Base64.getDecoder().decode(encoded_teksAsli);
        String result = new String(bytes);

        System.out.println(result);

    }
}
