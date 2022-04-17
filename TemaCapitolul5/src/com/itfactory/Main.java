package com.itfactory;

import com.itfactory.electronice.Laptop;
import com.itfactory.componente.*;

public class Main {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("asus", "negru",15.6);
        laptop1.detaliiLaptop();
        Ram laptop1ram = new Ram("DDR3", "GB", 16);
        laptop1ram.detaliiRam();
        MemorieSSD laptop1SSD = new MemorieSSD(256, "GB");
        System.out.println("Spatiu de stocare SSD: ");
        System.out.println("Capacitate stocare SSD: " + laptop1SSD.getCapacitateStocare());
        System.out.println("Unitate de masura stocare SSD: "+ laptop1SSD.getUnitateMasura());
    }
}
