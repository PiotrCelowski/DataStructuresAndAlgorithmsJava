public class BubbleSorter {
    public void sort(int[] array) {
        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
            for(int i=0; i<lastUnsortedIndex; i++){
                if(array[i]>array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }
    }

    public void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int holder = array[i];
        array[i] = array[j];
        array[j] = holder;
    }
    
}
