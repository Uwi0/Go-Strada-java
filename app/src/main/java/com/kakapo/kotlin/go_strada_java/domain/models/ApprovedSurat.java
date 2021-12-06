package com.kakapo.kotlin.go_strada_java.domain.models;

public class ApprovedSurat {
    private String keteranganSurat;
    private String tanggalSurat;

    public ApprovedSurat(String keteranganSurat, String tanggalSurat){
        this.keteranganSurat = keteranganSurat;
        this.tanggalSurat = tanggalSurat;
    }

    public String getKeteranganSurat() {
        return keteranganSurat;
    }

    public void setKeteranganSurat(String keteranganSurat) {
        this.keteranganSurat = keteranganSurat;
    }

    public String getTanggalSurat() {
        return tanggalSurat;
    }

    public void setTanggalSurat(String tanggalSurat) {
        this.tanggalSurat = tanggalSurat;
    }
}
