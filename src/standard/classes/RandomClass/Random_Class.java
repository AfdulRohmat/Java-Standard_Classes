package standard.classes.RandomClass;

import java.util.Random;

public class Random_Class {
    /*
        Random class adalah class yang bisa kita gunakan
        untuk men-generate random number

        doc:
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html
     */
    public static void main(String[] args) {

        Random random = new Random();

        for(var i=0; i<=20; i++){
            int randomNumber_int = random.nextInt(100);
            double randomNumber_double = random.nextDouble(100);


            System.out.println(randomNumber_int);
            System.out.println(randomNumber_double);
        }
    }
}
