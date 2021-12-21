package standard.classes.StringClass;

public class String_Class {
    public static void main(String[] args) {
        String name = "Afdul Rohmat";

        String toLowerCase= name.toLowerCase();
        String toUpperCase = name.toUpperCase();

        String[] nameSplit = name.split(" ");
        for (var value:nameSplit) {
            System.out.println(value);
        }

        System.out.println(name.length());
        System.out.println(name.startsWith("Afdul"));
        System.out.println(name.endsWith("mat"));
        System.out.println(name);
        System.out.println(toLowerCase);
        System.out.println(toUpperCase);

        // Lebih lengkap cek dokumentasi



    }
}
