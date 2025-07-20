import java.util.*;

/**
 * Kelas MahasiswaRepository bertanggung jawab untuk menangani seluruh proses
 * yang berkaitan dengan penyimpanan dan pengelolaan data mahasiswa
 * dalam bentuk struktur data Single Linked List.
 */
public class DatabaseMahasiswa {
    private Mahasiswa head = null;           // Node awal (head) dari linked list
    private int count = 0;                   // Jumlah data mahasiswa saat ini
    private final int MAKS_DATA = 5;         // Batas maksimum data mahasiswa
    private final Scanner input = new Scanner(System.in); // Scanner untuk input pengguna

    /**
     * Menambahkan data mahasiswa ke awal linked list setelah divalidasi.
     * Data ditolak jika sudah mencapai batas maksimum atau input tidak valid.
     */
    public void pushData() {
        if (count >= MAKS_DATA) {
            System.out.println("Jumlah maksimum mahasiswa telah tercapai.");
            return;
        }

        System.out.print("Masukkan NIM (maks 10 digit): ");
        String nim = input.nextLine().trim();
        if (nim.length() > 10 || !isNumeric(nim)) {
            System.out.println("NIM tidak valid. Harus angka dan maksimal 10 digit.");
            return;
        }

        System.out.print("Masukkan Nama (maks 30 karakter): ");
        String nama = input.nextLine().trim();
        if (nama.length() > 30) {
            System.out.println("Nama terlalu panjang.");
            return;
        }

        System.out.print("Masukkan Jurusan (maks 50 karakter): ");
        String jurusan = input.nextLine().trim();
        if (jurusan.length() > 50) {
            System.out.println("Jurusan terlalu panjang.");
            return;
        }

        Mahasiswa newNode = new Mahasiswa(nim, nama, jurusan);
        newNode.next = head;
        head = newNode;
        count++;

        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    /**
     * Menampilkan daftar mahasiswa secara ascending berdasarkan NIM.
     * Proses dilakukan dengan menyalin isi linked list ke ArrayList
     * lalu diurutkan menggunakan Comparator.
     */
    public void displayData() {
        if (head == null) {
            System.out.println("Belum ada data yang disimpan.");
            return;
        }

        List<Mahasiswa> list = new ArrayList<>();
        Mahasiswa current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }

        list.sort(Comparator.comparing(m -> m.nim));

        System.out.println("\nDaftar Mahasiswa (Urut Berdasarkan NIM):");
        for (Mahasiswa m : list) {
            System.out.println("NIM: " + m.nim + ", Nama: " + m.nama + ", Jurusan: " + m.jurusan);
        }
    }

    /**
     * Menghapus seluruh node dari linked list dengan mengosongkan referensi head
     * dan mengatur jumlah data kembali menjadi nol.
     */
    public void popAll() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }
        head = null;
        count = 0;
        System.out.println("Semua data mahasiswa telah dihapus.");
    }

    /**
     * Menampilkan menu interaktif berbasis teks dan menangani pilihan pengguna.
     */
    public void menu() {
        int pilihan = 0;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Hapus Semua Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu [1-4]: ");

            String inputStr = input.nextLine().trim();
            try {
                pilihan = Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid antara 1 dan 4.");
                continue;
            }

            switch (pilihan) {
                case 1 -> pushData();
                case 2 -> displayData();
                case 3 -> popAll();
                case 4 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 4);
    }

    /**
     * Fungsi pembantu untuk mengecek apakah string hanya berisi angka.
     * @param str String input pengguna
     * @return true jika numerik, false jika mengandung karakter non-digit
     */
    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}