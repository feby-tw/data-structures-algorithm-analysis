// Class Inventaris berfungsi sebagai class utama untuk mengelola inventaris barang di toko
public class Inventaris {

    public static void main(String[] args) {
        // Inisialisasi array inventaris dengan kapasitas 10
        Barang[] inventaris = new Barang[10];

        // Menambahkan 3 barang ke dalam array secara manual
        inventaris[0] = new Barang("Pensil", 50, 200);
        inventaris[1] = new Barang("Buku", 30, 15000);
        inventaris[2] = new Barang("Penghapus", 20, 500);

        // Menampilkan semua data awal pada inventaris
        System.out.println("Inventaris Toko:");
        tampilkanInventaris(inventaris);

        // Simulasi input: mengubah jumlah stok untuk barang "Pensil"
        String namaUpdate = "Pensil";
        int stokBaru = 60;
        System.out.println("\nMasukkan nama barang yang ingin diupdate: " + namaUpdate);
        System.out.println("Masukkan jumlah stok baru: " + stokBaru);

        updateStok(inventaris, namaUpdate, stokBaru);

        // Menampilkan data inventaris setelah update
        System.out.println("\nInventaris setelah diupdate:");
        tampilkanInventaris(inventaris);

        // Simulasi input: mencari barang dengan nama "Buku"
        String namaCari = "Buku";
        System.out.println("\nMasukkan nama barang yang dicari: " + namaCari);

        Barang hasil = cariBarang(inventaris, namaCari);

        // Menampilkan hasil pencarian
        System.out.println("Hasil pencarian:");
        if (hasil != null) {
            hasil.tampilkan();
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    // Method untuk menampilkan semua barang dalam array inventaris
    public static void tampilkanInventaris(Barang[] daftar) {
        int nomor = 1;
        for (Barang b : daftar) {
            if (b != null) {
                System.out.print(nomor + ". ");
                b.tampilkan();
                nomor++;
            }
        }
    }

    // Method untuk mengupdate jumlah stok suatu barang berdasarkan nama
    public static void updateStok(Barang[] daftar, String nama, int jumlahBaru) {
        for (int i = 0; i < daftar.length; i++) {
            Barang b = daftar[i];
            if (b != null && cocokNama(b.getNama(), nama)) {
                b.setJumlahStok(jumlahBaru);
                return;
            }
        }
        System.out.println("Barang dengan nama \"" + nama + "\" tidak ditemukan.");
    }

    // Method untuk mencari barang dalam array berdasarkan nama
    public static Barang cariBarang(Barang[] daftar, String nama) {
        for (int i = 0; i < daftar.length; i++) {
            Barang b = daftar[i];
            if (b != null && cocokNama(b.getNama(), nama)) {
                return b;
            }
        }
        return null;
    }

    // Method untuk membandingkan dua string secara manual (case-insensitive)
    public static boolean cocokNama(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            char ca = a.charAt(i);
            char cb = b.charAt(i);

            // Konversi huruf kapital ke huruf kecil tanpa toLowerCase()
            if (ca >= 'A' && ca <= 'Z') ca += 32;
            if (cb >= 'A' && cb <= 'Z') cb += 32;

            if (ca != cb) return false;
        }

        return true;
    }
}