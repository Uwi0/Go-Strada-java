package com.kakapo.kotlin.go_strada_java.domain.models;

public class JadwalKuliah {
    private String matkul;
    private String jamMasuk;
    private String jamPulang;
    private String gedungPerkuliahan;

    public JadwalKuliah(String matkul, String jamMasuk, String jamPulang, String gedungPerkuliahan){
        this.matkul = matkul;
        this.jamMasuk = jamMasuk;
        this.jamPulang = jamPulang;
        this.gedungPerkuliahan = gedungPerkuliahan;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public String getJamPulang() {
        return jamPulang;
    }

    public void setJamPulang(String jamPulang) {
        this.jamPulang = jamPulang;
    }

    public String getGedungPerkuliahan() {
        return gedungPerkuliahan;
    }

    public void setGedungPerkuliahan(String gedungPerkuliahan) {
        this.gedungPerkuliahan = gedungPerkuliahan;
    }
}
