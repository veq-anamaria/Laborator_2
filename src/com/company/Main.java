package com.company;

public class Main {

    public static void main(String[] args) {
        Medic myMedic = new Medic("Iulia", "Musteata", "Pediatru",2014,114);
        System.out.println(myMedic.printMedic());

        Pacient myPacient = new Pacient("Corina", "Petrescu", "Chisinau, Ion Creanga 45/1 ap.4", 1999, "31 A");
        System.out.println(myPacient.printMedic());

        myMedic.setAnAngajare(2012);
        System.out.println("####################"+"\n"+
                "Anul angajarii medic [modificat]->"+myMedic.getAnAngajare());
        myPacient.setAdresa("Chisinau, Miron Costin 26/1, ap.34");
        System.out.println("Adresa pacient [modificat]->"+myPacient.getAdresa());

        Domeniu MyDomeniu=new Domeniu();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+"\n"+
                "Denumire companie-"+MyDomeniu.denumire+"\n"+
                "Adresa-"+ MyDomeniu.adresa+"\n"+
                "Numarul total de angajati-"+MyDomeniu.nrAngajati+"\n"+
                "Tip serviciu-"+MyDomeniu.tipDomeniu+"\n"+
                "Cost servicii-"+MyDomeniu.costDom());
    }
}
