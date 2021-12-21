package standard.classes.RuntimeClass;

public class Runtime_Class {
    /*
        Ketika aplikasi Java kita berjalan, kita bisa melihat
        informasi environment tempat aplikasi Java berjalan

        Informasi itu terdapat di class Runtime.

        Class Runtime tidak bisa dibuat, secara otomatis
        Java akan membuat single object. Kita bisa
        mengakses  object  tersebut menggunakan static
        method getRuntime() milik class Runtime

        doc:
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Runtime.html

     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());

    }
}
