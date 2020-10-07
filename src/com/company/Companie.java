package com.company;

public class Companie {
    protected String denumire="Amdaris";
    protected String adresa="Tudor Vladimirescu 12/1";
    protected Integer nrAngajati=200;

    public double costDom(){
        Integer nrSoft=3;
        Integer pret=1500;
        return (nrSoft*pret);
    }
}

