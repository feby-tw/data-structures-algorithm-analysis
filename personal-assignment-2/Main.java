/**
 * Kelas Main merupakan titik masuk utama program yang memanggil
 * menu dari MahasiswaRepository.
 */
public class Main {
    public static void main(String[] args) {
        DatabaseMahasiswa repo = new DatabaseMahasiswa();
        repo.menu();
    }
}