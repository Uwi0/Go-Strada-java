package com.kakapo.kotlin.go_strada_java.domain.models;

public class KelasSelanjutnya {
    private int imgDosen;
    private String namaDosen;
    private String materi;
    private String keterangan = "";

    public KelasSelanjutnya(int imgDosen, String namaDosen, String materi, String keterangan){
        this.imgDosen = imgDosen;
        this.namaDosen = namaDosen;
        this.materi = materi;
        this.keterangan = keterangan;
    }

    public int getImgDosen() {
        return imgDosen;
    }

    public void setImgDosen(int imgDosen) {
        this.imgDosen = imgDosen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
