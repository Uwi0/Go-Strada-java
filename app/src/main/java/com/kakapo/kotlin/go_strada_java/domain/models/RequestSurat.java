package com.kakapo.kotlin.go_strada_java.domain.models;

public class RequestSurat {
    private String keterangan;
    private String tanggal;
    private String status;

    public RequestSurat(String keterangan, String tanggal, String status){
        this.keterangan = keterangan;
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
