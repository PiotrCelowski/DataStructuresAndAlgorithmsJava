public class SelectionSorter {
    public void sort(int[] array) {
        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
            int largestElement = 0;
            for(int i=1; i<=lastUnsortedIndex; i++) {
                if(array[i]>array[largestElement]){
                    largestElement=i;
                }
            }
            swap(array, largestElement, lastUnsortedIndex);
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
