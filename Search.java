package SMT2.Laprak9;

public class Search {
    
    public static int linearSearch(int[] arr, int search) {
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            check++;
            if (arr[i] == search) {
                System.out.println(">> Linear Search | Jumlah pemeriksaan: " + check);
                return i;
            }
        }
        System.out.println(">> Linear Search | Jumlah pemeriksaan: " + check);
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int check = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) { // Kondisi diperbaiki menjadi <= agar elemen terakhir tidak terlewat
            check++;
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println(">> Binary Search | Jumlah pemeriksaan: " + check);
                return mid;
            }
            if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(">> Binary Search | Jumlah pemeriksaan: " + check);
        return -1;
    }

        public static void main(String[] args) {
        int[] arr = new int[30];
        java.util.Random rand = new java.util.Random();

        for (int i = 0; i < arr.length; i++) {
            boolean unique;
            do {
                unique = true;
                arr[i] = rand.nextInt(100) + 1;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == arr[i]) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
        }

        boolean ada88 = false;
        for (int val : arr) {
            if (val == 88) ada88 = true;
        }
        if (!ada88) {
            arr[0] = 88; 
        }

        java.util.Arrays.sort(arr);

        System.out.println("=== DATA TERURUT ASCENDING (30 Elemen) ===");
        System.out.println(java.util.Arrays.toString(arr));
    
        int hasilCari88 = linearSearch(arr, 88);
        System.out.println("\n=== HASIL LINEAR SEARCH (Mencari 88) ===");
        System.out.println("Index di mana 88 ditemukan: " + hasilCari88);
    
        int nilaiTidakAda = -1;
        for (int i = 1; i <= 100; i++) {
            boolean ditemukan = false;
            for (int val : arr) {
                if (val == i) {
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                nilaiTidakAda = i;
                break; 
            }
        }

        int hasilCariTidakAda = linearSearch(arr, 7);
        System.out.println("Nilai yang dicari (rentang 1-100, tidak di array): " + nilaiTidakAda);
        System.out.println("Hasil linearSearch: " + hasilCariTidakAda);

        int hasilBinary88 = binarySearch(arr, 88);
        System.out.println("Hasil binarySearch untuk 88: " + hasilBinary88);

        System.out.println("\n=== UJI EFISIENSI PENCARIAN ===");
        System.out.print("Mencari 88 dengan Linear Search: ");
        linearSearch(arr, 88);
        
        System.out.print("Mencari 88 dengan Binary Search: ");
        binarySearch(arr, 88);
    }
}
