package com.kakapo.kotlin.go_strada_java.domain.models;

public class AbsenHarian {
    private String matkul;
    private String jamKuliah;

    public AbsenHarian(String matkul, String jamKuliah){
        this.matkul = matkul;
        this.jamKuliah = jamKuliah;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getJamKuliah() {
        return jamKuliah;
    }

    public void setJamKuliah(String jamKuliah) {
        this.jamKuliah = jamKuliah;
    }
}
