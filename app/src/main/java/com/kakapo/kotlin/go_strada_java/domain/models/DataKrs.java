package com.kakapo.kotlin.go_strada_java.domain.models;

public class DataKrs {
    private String kodeMk;
    private String mataKuliah;
    private String sks;

    public DataKrs(String kodeMk, String mataKuliah, String sks){
        this.kodeMk = kodeMk;
        this.mataKuliah = mataKuliah;
        this.sks = sks;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }
}
