public class BubbleSortExample {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean getauscht; // <-- Annas Optimierung

        for (int i = 0; i < n; i++) {
            getauscht = false; // <-- Vor jedem Durchlauf zurücksetzen
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // tausche Elemente
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    getauscht = true; // <-- Es wurde getauscht
                }
            }
            // Wenn nichts getauscht wurde, ist das Array sortiert!
            if (!getauscht) { // <-- Abbruchbedingung
                break;
                }
            }
        }
    }


