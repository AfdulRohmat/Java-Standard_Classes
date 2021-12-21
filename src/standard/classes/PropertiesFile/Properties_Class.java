package standard.classes.PropertiesFile;

import java.io.*;
import java.util.Properties;

public class Properties_Class {
    /*
        Kebanyakan aplikasi Java akan menyimpan konfigurasi
        file dalam bentuk properties file

        Properties file adalah file yang berisi key value
        yang dipisahkan dengan tanda sama dengan (=)

        Properties file bisa kita gunakan untuk menyimpan
        konfigurasi aplikasi kita
     */

    /*
        Properties Class adalah class yang bisa kita gunakan
        untuk mengambil atau menyimpan informasi ke file
        properties

        doc:
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html
     */
    public static void main(String[] args) {

        // load/baca data dari properties
        try {
            Properties properties = new Properties();

            //load properties
            properties.load(new FileInputStream("application.properties"));

            String firstname = properties.getProperty("name.firstname");
            String middlename = properties.getProperty("name.middlename");
            String lastname = properties.getProperty("name.lastname");

            System.out.println(firstname);
            System.out.println(middlename);
            System.out.println(lastname);

        }catch (FileNotFoundException exception){
            System.out.println("File tidak ketemu");

        }catch (IOException exception){
            System.out.println("Gagal load data");
        }

        //menambahkan properties
        try {
            Properties properties = new Properties();

            properties.put("password.new", "1234");
            properties.put("password.old", "qwerty");

            //menyimpan properties
            properties.store(new FileOutputStream("password.properties"), "Konfigurasi password");

        }catch (FileNotFoundException exception){
            System.out.println("Error membuat file properties");

        }catch (IOException exception){
            System.out.println("Error menyimpan properties");
        }
    }
}
