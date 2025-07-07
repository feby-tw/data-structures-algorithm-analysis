import java.util.ArrayList;

/**
 * Kelas utama Comparison digunakan untuk menguji performa Array dan ArrayList
 * dalam hal operasi traversal, pencarian, penyisipan, penghapusan, dan pengurutan.
 */
public class Comparison {
    public static void main(String[] args) {
        // Membuat array dan ArrayList dengan elemen 0 sampai 999
        int[] array = new int[1000];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            array[i] = i;
            list.add(i);
        }

        // Traversal Array
        long start = System.nanoTime();
        ArrayOperations.traverse(array);
        long end = System.nanoTime();
        System.out.printf("Array traversal time: %.3f ms\n", (end - start) / 1_000_000.0);

        // Traversal ArrayList
        start = System.nanoTime();
        ArrayListOperations.traverse(list);
        end = System.nanoTime();
        System.out.printf("ArrayList traversal time: %.3f ms\n", (end - start) / 1_000_000.0);

        // Linear Search pada Array
        start = System.nanoTime();
        int indexArray = ArrayOperations.linearSearch(array, 888);
        end = System.nanoTime();
        System.out.printf("Array search index: %d, time: %.3f ms\n", indexArray, (end - start) / 1_000_000.0);

        // Search pada ArrayList
        start = System.nanoTime();
        int indexList = ArrayListOperations.search(list, 888);
        end = System.nanoTime();
        System.out.printf("ArrayList search index: %d, time: %.3f ms\n", indexList, (end - start) / 1_000_000.0);

        // Penyisipan pada Array
        start = System.nanoTime();
        array = ArrayOperations.insert(array, 500, 9999);
        end = System.nanoTime();
        System.out.printf("Array insert time: %.3f ms\n", (end - start) / 1_000_000.0);

        // Penyisipan pada ArrayList
        start = System.nanoTime();
        ArrayListOperations.insert(list, 500, 9999);
        end = System.nanoTime();
        System.out.printf("ArrayList insert time: %.3f ms\n", (end - start) / 1_000_000.0);

        // Penghapusan pada Array
        start = System.nanoTime();
        array = ArrayOperations.delete(array, 500);
        end = System.nanoTime();
        System.out.printf("Array delete time: %.3f ms\n", (end - start) / 1_000_000.0);

        // Penghapusan pada ArrayList
        start = System.nanoTime();
        ArrayListOperations.delete(list, 500);
        end = System.nanoTime();
        System.out.printf("ArrayList delete time: %.3f ms\n", (end - start) / 1_000_000.0);

        // Pengurutan ArrayList
        start = System.nanoTime();
        ArrayListOperations.sort(list);
        end = System.nanoTime();
        System.out.printf("ArrayList sort time: %.3f ms\n", (end - start) / 1_000_000.0);
    }
}