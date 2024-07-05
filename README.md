# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Monitor`, `MonitorDetail`, dan `MonitorBeraksi` adalah contoh dari class.

```bash
public class Monitor {
    ...
}

public class MonitorDetail extends Monitor {
    ...
}

public class MonitorBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `monitors[i] = new MonitorDetail(brand, size);` adalah contoh pembuatan object.

```bash
monitors[i] = new MonitorDetail(brand, size);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `Brand` dan `Size` adalah contoh atribut.

```bash
String Brand;
String Size;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Monitor` dan `MonitorDetail`.

```bash
public Monitor(String brand, String size) {
      this.brand = brand;
      this.size = size;
}

public MonitorDetail(String brand, String size) {
      super(brand, size);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBrand` dan `setSize` adalah contoh method mutator.

```bash
public void setBrand(String brand) {
      this.brand = brand;
}

public void setSize(String size) {
      this.size = size;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getBrand`, `getSize`, `getTahunProduksi`, dan `getTipeLayar` adalah contoh method accessor.

```bash
public String getBrand() {
      return brand;
}

public String getSize() {
      return size;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `Brand` dan `Size` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String Brand;
private String Size;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MonitorDetail` mewarisi `Monitor` dengan sintaks `extends`.

```bash
public class MonitorDetail extends Monitor {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo()` di `Monitor` merupakan overloading method `displayInfo` dan `displayInfo` di `MonitorDetail` merupakan override dari method `displayInfo` di `Monitor`.

```bash
public String displayInfo(){
    return "Brand: "+getBrand()+
            "\nSize: "+getSize();
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan cuma seleksi `if else` dalam method `getTipeLayar`.

```bash
public String getTipeLayar() {
    int ukuran = Integer.parseInt(getSize());
    if (ukuran > 18) {
        return "LED";
    } else {
        return "Bukan LED";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < monitors.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("Masukkan data Monitor: " + (i + 1));
String nama = scanner.nextLine();

System.out.println("Data Monitor:");
System.out.println(mahasiswa.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MonitorDetail[] monitors = new MonitorDetail[2];` adalah contoh penggunaan array.

```bash
MonitorDetail[] monitors = new MonitorDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Salah: " + e.getMessage());
}
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
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat
```
Nama: Ahmad Naufal
NPM: 2210010168
