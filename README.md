# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data bunga menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, harga, dan jenis bunga dari pengguna, serta memberikan output berupa daftar bunga yang berhasil disimpan dan ditampilkan dalam format tertentu.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, 'Bunga', 'BungaHias', dan 'TokoBunga' adalah contoh dari class.

```bash
public class Bunga {
    ...
}

public class BungaHias extends Bunga {
   ...
}

public class TokoBunga {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, 'daftarbunga[i] = new BungaHias(nama, harga, jenis);' adalah contoh pembuatan object.

```bash
daftarbunga[i] = new BungaHias(nama, harga, jenis);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, 'nama', 'harga', dan 'jenis' adalah contoh atribut.

```bash
String nama;
int harga;
String jenis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class 'Bunga' dan 'BungaHias'.

```bash
public Bunga(String nama, int harga) {
    this.nama = nama;
    this.harga = harga;
}

public BungaHias(String nama, int harga, String jenis) {
    super(nama, harga);
    this.jenis = jenis;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, 'setNama', 'setHarga', dan 'setJenis' adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(int harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, 'getNama', 'getHarga', dan 'getJenis' adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut 'nama', 'harga', dan 'jenis' dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int harga;
private String jenis;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, 'BungaHias' mewarisi 'Bunga' dengan sintaks 'extends'.

```bash
public class BungaHias extends Bunga {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method 'infoBunga()' di 'BungaHias' merupakan override dari method 'infoBunga()' di 'Bunga'.
   
```bash
public String infoBunga(String jenis) {
    return infoBunga() + "\nJenis: " + jenis;
}

@Override
public String infoBunga() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi 'if else' untuk menentukan apakah bunga termasuk jenis hias atau tidak.

```bash
if (tipe.equalsIgnoreCase("ya")) {
    // buat objek BungaHias
} else {
    // buat objek Bunga biasa
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop 'for' untuk meminta input dan menampilkan data bunga.

```bash
for (int i = 0; i < daftarbunga.length; i++) {
    ...
}
```

12. Input Output Sederhana digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class 'Scanner' untuk menerima input dan method 'System.out.println' untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nama Bunga : ");
String nama = input.nextLine();

System.out.println("\nDaftar Bunga:");
System.out.println(daftarbunga[i].infoBunga());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, 'Bunga[] daftarbunga = new Bunga[3];' adalah contoh penggunaan array.

```bash
Bunga[] daftarbunga = new Bunga[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan 'try catch' untuk menangani kesalahan input angka.

```bash
try {
    harga = Integer.parseInt(input.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input Harga Harus Berupa Angka! Data Bunga Tidak disimpan.");
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

Nama: Wirda Hajiza Fadila

NPM: 2310010076
