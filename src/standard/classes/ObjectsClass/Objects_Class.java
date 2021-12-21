package standard.classes.ObjectsClass;

import java.util.Objects;

public class Objects_Class {
    /*
        Objects adalah class utility yang berisikan banyak
        static method yang bisa kita gunakan untuk operasi
        object atau melakukan pengecekan sebelum operasi nya
        dilakukan

        doc:
        https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html
     */
    public static class Data {

        private String data;

        public Data(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;

            return data != null ? data.equals(data1.data) : data1.data == null;
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        execute(null);

    }

    public static void execute(Data data){


        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));

    }
}
