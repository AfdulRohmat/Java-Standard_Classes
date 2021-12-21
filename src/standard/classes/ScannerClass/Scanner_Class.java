package standard.classes.ScannerClass;

import java.util.Scanner;

public class Scanner_Class {
    /*
        Class Scanner adalah class yang bisa digunakan untuk
        membaca input, entah dari file, console,
        dan lain-lain

        Scanner bagian dari Java IO (Input Output)

        Class Scanner ini cocok untuk dijadikan object untuk
        membaca input user saat kita belajar membuat program
        Java menggunakan console / terminal
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        int umur = input.nextInt();

        System.out.print("tinggi badan: ");
        double tinggi_badan = input.nextDouble();

        System.out.println("\nnama: "+nama);
        System.out.println("umur: "+umur+" kg");
        System.out.println("tinggi badan: "+tinggi_badan+" cm");

    }
}
