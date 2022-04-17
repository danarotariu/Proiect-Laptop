package com.itfactory.componente;

public class Ram
{
    public String tipMemorie;
    public String unitateMasura;
    public int capacitateMemorie;
    public Ram (String tipMemorie, String unitateMasura, int capacitateMemorie){
        this.tipMemorie = tipMemorie;
        this.unitateMasura = unitateMasura;
        this.capacitateMemorie = capacitateMemorie;
    }
    public void detaliiRam(){
        System.out.println("Memore RAM:");
        System.out.println("Tip de memorie RAM:" + " " + this.tipMemorie);
        System.out.println("Unitate de masura memore RAM:" + " " + this.unitateMasura);
        System.out.println("Capacitate memorie RAM:" + " " + this.capacitateMemorie);
    }
    public String getTipMemorie()
    {
        return tipMemorie;
    }

    public void setTipMemorie(String tipMemorie)
    {
        this.tipMemorie = tipMemorie;
    }

    public String getUnitateMasura()
    {
        return unitateMasura;
    }

    public void setUnitateMasura(String unitateMasura)
    {
        this.unitateMasura = unitateMasura;
    }

    public int getCapacitateMemorie()
    {
        return capacitateMemorie;
    }

    public void setCapacitateMemorie(int capacitateMemorie)
    {
        this.capacitateMemorie = capacitateMemorie;
    }
}
