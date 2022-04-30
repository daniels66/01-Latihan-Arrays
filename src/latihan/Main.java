package latihan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 5, 6, 9, 9, 1 };
        int[] array2 = { 2, 4, 1, 5, 2, 5, 2, 7, 8, 2 };

        // menggabungkan kedua arrays
        int[] hasil = gabung(array1, array2);
        printArray(hasil, "gabung");

        // menambahkan kedua array
        int[] hasil2 = tambah(array1, array2);
        printArray(hasil2, "tambah");

    }

    private static int[] tambah(int[] array1, int[] array2) {
        int[] array4 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array4[i] = array1[i] + array2[i];
        }
        return array4;
    }

    private static int[] gabung(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[(array1.length + i)] = array2[i];
        }
        return array3;
    }

    private static void printArray(int[] array, String pesan) {
        System.out.println(pesan + " " + Arrays.toString(array));
    }

}