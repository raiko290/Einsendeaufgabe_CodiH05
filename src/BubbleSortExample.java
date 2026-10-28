public class BubbleSortExample {
    static void bubbleSort(int[] liste) {
        int n = liste.length;
        int temp = 0;
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
}

