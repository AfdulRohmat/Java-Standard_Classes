package standard.classes.UUIDClass;

import java.util.UUID;

public class UUID_Class {
    /*
        UUID atau singkatan dari Universally Unique Identifier.

        UUID adalah format standard untuk membuat unique
        value yang telah terjamin unik

        Biasa digunakan saat membuat aplikasi dengan data
        uniq seperti id atau primary key
     */

    public static void main(String[] args) {

        for(var i=0; i<=20; i++){
            UUID uuid = UUID.randomUUID();
            String random_key = uuid.toString();
            System.out.println(random_key);
        }

    }
}
