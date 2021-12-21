package standard.classes.SystemClass;

public class System_Class {
    /*
        Class System adalah class yang berisikan banyak
        utility static method di Java, contohnya sebelumnya
        kita sudah sering menggunakan method println milik
        field out di class System

        lebih lengkap baca doc
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html
     */
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("HOME"));

        System.gc();

        System.out.println("Hi");

        System.exit(1);

    }
}
