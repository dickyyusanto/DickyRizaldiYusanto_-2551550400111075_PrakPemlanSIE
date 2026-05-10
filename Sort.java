package SMT2.Laprak9;

import java.util.Arrays;

public class Sort {
    
        public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[i]) {
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++; 
                }
            }
        }
        System.out.println(">> Bubble Sort | Total tukar/geser: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            while (k >= 0 && list[k] < key) {
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++; 
            }
            list[k + 1] = key;
        }
        System.out.println(">> Insertion Sort | Total tukar/geser: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int maxIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[maxIndex]) {
                    maxIndex = k;
                }
            }
            if (maxIndex != i) {
                int t = list[maxIndex];
                list[maxIndex] = list[i];
                list[i] = t;
                tukarAtauGeser++; 
            }
        }
        System.out.println(">> Selection Sort | Total tukar/geser: " + tukarAtauGeser);
        return list;
    }


    public static void main(String[] args) {
        
        int[] arr = new int[30];
        java.util.Random rand = new java.util.Random();
        
        for (int i = 0; i < arr.length; i++) {
            boolean unique;
            do {
                unique = true;
            int kandidat = rand.nextInt(100) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] == kandidat) {
                    unique = false; 
                    break;
                }
            }
                
                if (unique) {
                    arr[i] = kandidat;
                }
            } while (!unique);
        }
        
        System.out.println("=== DATA AWAL (30 Elemen Acak Unik) ===");
        System.out.println(Arrays.toString(arr));
        System.out.println();


        System.out.println("\n=== EKSEKUSI BUBBLE SORT ===");
        System.out.println("Sebelum: " + Arrays.toString(arr));
        int[] copyBubble = Arrays.copyOf(arr, arr.length);
        System.out.println("Sesudah: " + Arrays.toString(bubble(copyBubble)));

        System.out.println("\n=== EKSEKUSI INSERTION SORT ===");
        System.out.println("Sebelum: " + Arrays.toString(arr));
        int[] copyInsertion = Arrays.copyOf(arr, arr.length);
        System.out.println("Sesudah: " + Arrays.toString(insertion(copyInsertion)));

        System.out.println("\n=== EKSEKUSI SELECTION SORT ===");
        System.out.println("Sebelum: " + Arrays.toString(arr));
        int[] copySelection = Arrays.copyOf(arr, arr.length);
        System.out.println("Sesudah: " + Arrays.toString(selection(copySelection)));


        System.out.println("\n=== ANALISIS EFISIENSI ===");
        int[] copy1 = Arrays.copyOf(arr, arr.length);
        bubble(copy1);

        int[] copy2 = Arrays.copyOf(arr, arr.length);
        insertion(copy2);

        int[] copy3 = Arrays.copyOf(arr, arr.length);
        selection(copy3);
    }
}