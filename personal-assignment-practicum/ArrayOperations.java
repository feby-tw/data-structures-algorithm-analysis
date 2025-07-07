/**
 * Kelas ArrayOperations berisi berbagai metode untuk operasi dasar pada struktur data Array,
 * termasuk traversal, pencarian (linear dan biner), penyisipan, dan penghapusan elemen.
 */
public class ArrayOperations {

    // Menampilkan semua elemen array
    public static void traverse(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Melakukan pencarian linear pada array (O(n))
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }

    // Melakukan pencarian biner pada array (O(log n)) – hanya berlaku untuk array terurut
    public static int binarySearch(int[] array, int key) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == key) return mid;
            else if (array[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Menyisipkan elemen ke array pada posisi tertentu
    public static int[] insert(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index); // Salin elemen sebelum indeks
        newArray[index] = value; // Sisipkan nilai baru
        System.arraycopy(array, index, newArray, index + 1, array.length - index); // Salin sisanya
        return newArray;
    }

    // Menghapus elemen pada indeks tertentu dari array
    public static int[] delete(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index); // Salin elemen sebelum indeks
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1); // Salin sisanya
        return newArray;
    }
}