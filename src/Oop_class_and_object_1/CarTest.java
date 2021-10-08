package Oop_class_and_object_1;

import com.sun.nio.sctp.SctpSocketOption;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrendi("BMW");
        c1.setTipi("M5");
        c1.setNgjyra("E bardhe");
        c1.setVitiProdhimit(2012);

        Car c2 = new Car();
        c2.setNgjyra("E kuqe");
        c2.setBrendi("Mercedes");
        c2.setTipi("S Class");
        c2.setVitiProdhimit(2017);

        System.out.println("Vetura e pare eshte nga brendi " + c1.getBrendi() + " dhe ka ngjyren " + c1.getNgjyra());

    }
}
