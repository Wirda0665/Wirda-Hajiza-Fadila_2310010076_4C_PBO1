package UAS_PBO1;

// SuperClass
public class bunga {
// Atribut dengan Encapsulation
    private String nama;
    private int harga;

    // Constructor
    public bunga(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
        // Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // Polymorphism overloading (Method yang bisa dioverride)
    public String infoBunga() {
    return "Nama Bunga : " + nama + 
           "\nHarga : " + harga;
    }
}