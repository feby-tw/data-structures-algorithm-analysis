// Class Barang merepresentasikan sebuah entitas barang dalam inventaris toko
public class Barang {
    // Private attribute untuk menyimpan data barang
    private String nama;
    private int jumlahStok;
    private double harga;

    // Constructor untuk inisialisasi objek Barang
    public Barang(String nama, int jumlahStok, double harga) {
        this.nama = nama;
        this.jumlahStok = jumlahStok;
        this.harga = harga;
    }

    // Getter untuk mendapatkan nama barang
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan jumlah stok
    public int getJumlahStok() {
        return jumlahStok;
    }

    // Getter untuk mendapatkan harga barang
    public double getHarga() {
        return harga;
    }

    // Setter untuk mengubah jumlah stok
    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    // Method untuk menampilkan informasi barang ke layar
    public void tampilkan() {
        System.out.println("Nama: " + nama + ", Jumlah Stok: " + jumlahStok + ", Harga: " + (int) harga);
    }
}