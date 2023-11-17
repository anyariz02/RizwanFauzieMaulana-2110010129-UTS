package model;

public class Diary {
    private int idDiary;
    private String judul;
    private String tanggal;
    private String catatan;

    public Diary(int idDiary, String tanggal, String judul, String catatan) {
        this.idDiary = idDiary;
        this.judul = judul;
        this.tanggal = tanggal;
        this.catatan = catatan;
    }

    public Diary() {
    }
  

    public int getIdDiary() {
        return idDiary;
    }

    public void setIdDiary(int idDiary) {
        this.idDiary = idDiary;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
    
    
    
    
}


