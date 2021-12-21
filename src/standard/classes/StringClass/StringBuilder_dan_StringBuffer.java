package standard.classes.StringClass;

public class StringBuilder_dan_StringBuffer {
    /*
        String adalah tipe data immutable, artinya tidak bisa
        berubah isinya, saat kita mengubah string, sebenarnya
        yang dilakukan di Java adalah membuat String baru.

        Jika kita ingin memanipulasi String dalam jumlah banyak,
        sangat tidak disarankan menggunakan String,  karena akan
        memakan memory yang cukup besar, untuk kasus seperti ini,
        disarankan menggunakan StringBuffer atau StringBuilder
     */

    /*
        StringBuffer dan StringBuilder

        Kemampuan StringBuffer dan StringBuilder cukup sama,
        bisa digunakan untuk memanipulasi String

        StringBuffer itu thread safe. sedangkan StringBuilder
        tidak thread safe

        Jika ingin memanipulasi String secara paralel
        bersamaan, disarankan menggunakan StringBuffer,
        namun jika tidak butuh paralel, cukup gunakan
        StringBuilder

        Karena StringBuffer dibuat agar thread safe, maka secara
        otomatis performanya lebih lambat dibandingkan
        StringBuilder
     */
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // memasukkan string
        stringBuilder.append("Afdul");
        stringBuilder.append(" ");
        stringBuilder.append("Rohmat");

        // menggabungkan stringBuilder
        String fullname = stringBuilder.toString();
        System.out.println(fullname);

    }
}
