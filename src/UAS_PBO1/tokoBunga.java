package UAS_PBO1;

import java.util.Scanner;

public class tokoBunga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bunga[] daftarbunga = new bunga[3]; // Array
        int jumlahBunga = 0;
        
        System.out.println("=== Program Toko Bunga ===");
        
        // Perulangan untuk input bunga
        for (int i = 0; i < daftarbunga.length; i++) {
          try {
              System.out.print("\nMasukkan Nama Bunga : ");
              String nama = input.nextLine();
              
              System.out.print("Masukkan Harga Bunga : ");
              int harga = Integer.parseInt(input.nextLine());
              
              System.out.print("Apakah Ini Bunga Hias ? (YA/TIDAK) : ");
              String pilihan = input.nextLine();
              
              // Seleksi
              if (pilihan.equalsIgnoreCase("YA")){
                  System.out.print("Masukkan Jenis Bunga Hias : ");
                  String jenis = input.nextLine();
                  daftarbunga[i] = new bungaHias(nama, harga, jenis);
              } else {
                  daftarbunga [i] = new bunga(nama, harga);
              }
              
              jumlahBunga++;
            } catch (NumberFormatException e) { // Error Handling
                System.out.print("\nInput Harga Harus Berupa Angka! Data Bunga Tidak disimpan.\n");
            }
        }
        
        System.out.print("\n=== Daftar Bunga di Toko ===\n\n");
        
        // Perulangan untuk menampilkan bunga
        for (int i = 0; i < jumlahBunga; i++) {
            System.out.println((i + 1) + "." +daftarbunga[i].infoBunga());
        }
        
        input.close();
    }
}
