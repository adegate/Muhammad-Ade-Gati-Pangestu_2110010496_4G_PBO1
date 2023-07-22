package uaspbo1;
//Class
public class mobil {
    //Atribut Enkapsulasi
    private String nama;
    private String namaMobil;
    private String tahunMobil;

    public mobil(String nama, String namaMobil, String tahunMobil) {
        this.nama = nama;
        this.namaMobil = namaMobil;
        this.tahunMobil = tahunMobil;
    }
    
    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public void setTahunMobil(String tahunMobil) {
        this.tahunMobil = tahunMobil;
    }
    
    //Getter
    public String getNama() {
        return nama;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public String getTahunMobil() {
        return tahunMobil;
    }
    
    public String displayInfo(){
        return "=============\nNama Pembeli: " + getNama();
    }
    
    //Polymorph Overloading
    public String displayInfo(String warna){
        return displayInfo() + "\nWarna :" + warna;
    }
}
