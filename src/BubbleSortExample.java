public class BubbleSortExample {
    static void bubbleSort(int[] liste) {
        int n = liste.length;
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
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(liste[j-1] > liste[j]){
                    //swap elements
                    temp = liste[j-1];
                    liste[j-1] = liste[j];
                    liste[j] = temp;
                }
            }
        }
    }


