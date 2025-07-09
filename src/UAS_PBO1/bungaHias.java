package UAS_PBO1;

// Inherintance
public class bungaHias extends bunga {
    private String jenis;
    
    public bungaHias(String nama, int harga, String jenis) {
        super(nama, harga); // Memanggil constructor dari superclass
        this.jenis = jenis;
    }
    
    // override method infoBunga (Plymorphism)
    @Override
    public String infoBunga() {
        return "Nama Bunga Hias : " + getNama() + 
               "\nHarga : " + getHarga() + 
               "\nJenis : " + jenis;
    }
}
