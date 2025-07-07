import java.util.ArrayList;
import java.util.Collections;

/**
 * Kelas ArrayListOperations menyediakan operasi-operasi dasar pada ArrayList,
 * termasuk traversal, pencarian, penyisipan, penghapusan, dan pengurutan.
 */
public class ArrayListOperations {

    // Menampilkan semua elemen dari ArrayList
    public static void traverse(ArrayList<Integer> list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Mencari posisi elemen (O(n)) – menggunakan indexOf
    public static int search(ArrayList<Integer> list, int key) {
        return list.indexOf(key);
    }

    // Menyisipkan elemen pada indeks tertentu
    public static void insert(ArrayList<Integer> list, int index, int value) {
        list.add(index, value);
    }

    // Menghapus elemen pada indeks tertentu
    public static void delete(ArrayList<Integer> list, int index) {
        list.remove(index);
    }

    // Mengurutkan ArrayList menggunakan Collections.sort() (merge sort)
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}