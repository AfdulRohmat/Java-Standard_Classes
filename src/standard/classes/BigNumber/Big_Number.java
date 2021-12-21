package standard.classes.BigNumber;

import java.math.BigInteger;

public class Big_Number {
    /*
        ika kita ada kebutuhan untuk menggunakan angka yang
        besar sehingga melebihi kapasitas Long dan Double,
        di Java sudah disediakan class untuk handle data
        besar tersebut

        BigInteger adalah class untuk handle tipe data
        Integer

        BigDecimal adalah class untuk handle tipe data
        floating point

        Lebih lengkap buka dokumentasi
     */
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000");
        BigInteger b = new BigInteger("10000000000000000");

        BigInteger tambah = a.add(b);
        BigInteger kurang = a.subtract(b);
        BigInteger kali = a.multiply(b);
        BigInteger bagi = a.divide(b);
        BigInteger modulus = a.mod(b);
        // ... dan masih banyak lagi

        System.out.println(tambah);
        System.out.println(kurang);
        System.out.println(kali);
        System.out.println(bagi);
        System.out.println(modulus);
    }
}
