/**
 * Kelas Mahasiswa merepresentasikan sebuah node dalam struktur Single Linked List.
 * Setiap node menyimpan data mahasiswa berupa NIM, nama, jurusan, dan pointer ke node berikutnya.
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    public String jurusan;
    public Mahasiswa next;

    /**
     * Konstruktor untuk menginisialisasi node mahasiswa baru.
     * @param nim Nomor Induk Mahasiswa
     * @param nama Nama lengkap mahasiswa
     * @param jurusan Jurusan tempat mahasiswa belajar
     */
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.next = null;
    }
}