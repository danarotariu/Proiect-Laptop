package com.itfactory.electronice;
import com.itfactory.componente.*;

public class Laptop {
    private String marca;
    private String culoare;
    private double dimensiuneEcran;
    //private MemorieSSD;
    //private Ram;

    public Laptop(String marca, String culoare, double dimensiuneEcran) {
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;

    }

    public void detaliiLaptop(){
        System.out.println("Detalii laptop: ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Culoare: " + this.culoare);
        System.out.println("Dimensiune Ecran: " + this.dimensiuneEcran);
    }

    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setDimensiuneEcran(double dimensiuneEcran) {
        this.dimensiuneEcran = dimensiuneEcran;
    }
}
