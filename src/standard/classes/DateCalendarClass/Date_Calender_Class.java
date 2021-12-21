package standard.classes.DateCalendarClass;

import java.util.Calendar;
import java.util.Date;

public class Date_Calender_Class {
    /*
         class Date & Calendar yang bisa kita gunakan sebagai
         representasi tanggal

         Class Date adalah class representasi tanggal sampai
         presisi milisecond

         Namun di class Date sudah banyak method-method yang
         di deprecated, sehingga untuk memanipulasi date
         tanggal, kita sekarang harus melakukan kombinasi
         antara class Date dan Calendar

         Sederhananya Date untuk representasi tanggal,
         dan Calendar untuk memanipulasi tanggal

         Lebih lengkap baca dokumentasi
     */
    public static void main(String[] args) {
        // Date untuk representasi tanggal
        Date tanggal = new Date(23587200000L);

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, calendar.DECEMBER);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
