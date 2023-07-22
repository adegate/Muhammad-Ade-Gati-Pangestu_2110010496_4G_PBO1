
package uaspbo1;

import  java.util.Scanner;
public class showroomMobil {
    public static void main(String[] args) { 
        //IO Sederhana
        Scanner scanner = new Scanner(System.in);
        
        //Array
        statusMobil[] pembeli = new statusMobil[2];
        
        for(int i=0; i<pembeli.length; i++){
        System.out.print("======================\nMasukkan nama Pembeli "+(i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("1.Avanza\n2.Xenia\n3.Jazz\n4.Civic\n5.Vios\nPilih Mobil: ");
        String namaMobil = scanner.nextLine();
        System.out.print("1.2005-2010\n2.2010-2015\n3.2015-2020\nPilih Tahun Mobil: ");
        String tahunMobil = scanner.nextLine();
        
        //Objek
        pembeli[i] = new statusMobil(nama, namaMobil, tahunMobil);
        }
        System.out.println("===Data Pembeli===");
        for(statusMobil data : pembeli){
        System.out.println(data.displayInfo());
        }
        
    }
}
