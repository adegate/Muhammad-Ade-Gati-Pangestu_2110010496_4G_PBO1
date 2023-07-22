package uaspbo1;
//Inheritance
public class statusMobil extends mobil{

    public statusMobil(String nama, String namaMobil, String tahunMobil) {
        super(nama, namaMobil, tahunMobil);
    }
    //seleksi switch
    public String getMobil(){
        String kodeMobil = getNamaMobil();
        switch(kodeMobil){
            case "1":
                return "Avanza";
            case "2":
                return "Xenia";
            case "3":
                return "Jazz";
            case "4":
                return "Civic";
            case "5":
                return "Vios";
            default:
                return "mobil tidak terdaftar";
        }
    }
    //seleksi if
    public String getTahun(){
        String tahunMobil = getTahunMobil();
        if (tahunMobil.equals("1")){
            return "2005-2010";
        } else {
        if (tahunMobil.equals("2")){
            return "2010-2015";
        } else {
        if (tahunMobil.equals("3")){
            return "2015-2020";
        } else {
            return "tahun tidak diketahui";
        }
        }
       }
    }
    
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\n Mobil : " + getMobil()+
                "\n Tahun : " + getTahun();
    }
}
