public class QuickSorter {
    public void sort(int[] array, int start, int end) {
        if( end-start < 2 ) {
            return;
        }

        int pivotElement = partition(array, start, end);
        sort(array, start, pivotElement);
        sort(array, pivotElement+1, end);
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int leftIndex = start;
        int rightIndex = end;

        while( leftIndex<rightIndex ) {

            //Going from the right side of the array
            while( leftIndex<rightIndex && array[--rightIndex]>=pivot );
            if( leftIndex<rightIndex ) {
                array[leftIndex] = array[rightIndex];
            }

            //Going from the left side of the array
            while( leftIndex<rightIndex && array[++leftIndex]<=pivot );
            if( leftIndex<rightIndex ) {
                array[rightIndex] = array[leftIndex];
            }
        }

        array[rightIndex]=pivot;
        return rightIndex;
    }
}
