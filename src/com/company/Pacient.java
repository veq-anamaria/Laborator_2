package com.company;

public class Pacient {
    private String nume;
    private String prenume;
    private String adresa;
    private Integer anNastere;
    private String sector;


    public Pacient(String nume, String prenume, String adresa, Integer anNastere, String sector) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.anNastere = anNastere;
        this.sector = sector;

    }

    //set
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setAnNastere(Integer anNastere) {
        this.anNastere = anNastere;
    }

    public void setCabinet(String sector) {
        this.sector = sector;
    }

    //get
    public String getNume() {
        return nume;
    }

    public String getprenume() {
        return prenume;
    }
    public String getAdresa() {
        return adresa;
    }
    public Integer getAnNastere() {
        return anNastere;
    }

    public String getSector() {
        return sector;
    }

    public String printMedic() {
        return  "****************"+"\n"+
                "Nume pacient-" + this.nume + "\n" +
                "Prenumele precient-" + this.prenume + "\n" +
                "Adresa-" + this.adresa + "\n" +
                "Anul nasterii-" + this.anNastere + "\n" +
                "Sector-" + this.sector;

    }
}
