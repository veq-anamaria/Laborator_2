package com.company;

public class Medic {
    private String nume;
    private String prenume;
    private String specialitate;
    private Integer anAngajare;
    private Integer cabinet;

    //constructor
    public Medic(String nume, String prenume, String specialitate, Integer anAngajare, Integer cabinet) {
        this.nume = nume;
        this.prenume = prenume;
        this.specialitate = specialitate;
        this.anAngajare = anAngajare;
        this.cabinet = cabinet;
    }
    //set
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setPrenume(String prenume){
        this.prenume=prenume;
    }
    public void setSpecialitate(String specialitate){
        this.specialitate=specialitate;
    }
    public void setAnAngajare(Integer anAngajare){
        this.anAngajare=anAngajare;
    }
    public void setCabinet(Integer cabinet){
        this.cabinet=cabinet;
    }
    //get
    public String getNume(){
        return nume;
    }
    public String getprenume(){
        return prenume;
    }
    public Integer getAnAngajare(){
        return anAngajare;
    }
    public Integer getCabinet(){
        return cabinet;
    }

    public String printMedic(){
        return "Nume medic-"+this.nume+"\n"+
                "Prenumele medic-"+ this.prenume+"\n" +
                "Specialitate-"+ this.specialitate+"\n"+
                "Anul angajarii-"+ this.anAngajare+ "\n"+
                "Cabinet-" + this.cabinet;

    }
}

