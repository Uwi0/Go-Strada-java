package com.kakapo.kotlin.go_strada_java.domain.models;

public class DataKhs {
    private String nilai;
    private String namaMatkul;
    private String namaMatkulInggris;
    private String sks;
    private String kodeMatkul;
    private String  bobot;

    public DataKhs(
            String nilai,
            String namaMatkul,
            String namaMatkulInggris,
            String sks,
            String kodeMatkul,
            String bobot
    ){
        this.nilai = nilai;
        this.namaMatkul = namaMatkul;
        this.namaMatkulInggris = namaMatkulInggris;
        this.sks = sks;
        this.kodeMatkul = kodeMatkul;
        this.bobot = bobot;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getNamaMatkulInggris() {
        return namaMatkulInggris;
    }

    public void setNamaMatkulInggris(String namaMatkulInggris) {
        this.namaMatkulInggris = namaMatkulInggris;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getBobot() {
        return bobot;
    }

    public void setBobot(String bobot) {
        this.bobot = bobot;
    }
}
