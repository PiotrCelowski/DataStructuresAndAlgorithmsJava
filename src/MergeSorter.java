public class MergeSorter {
    public void sort(int[] array, int startPoint, int endPoint) {
        if(endPoint-startPoint<2){
            return;
        }

        int middlePoint = (startPoint + endPoint)/2;
        sort(array, startPoint, middlePoint);
        sort(array, middlePoint, endPoint);
        merge(array, startPoint, middlePoint, endPoint);
    }

    private void merge(int[] array, int start, int middle, int end) {
        if(array[middle-1] <= array[middle]) {
            return;
        }

        int[] tempArray = new int[end-start];
        int tempIndex = 0;

        int leftArrayIndex = start;
        int rightArrayIndex = middle;

        while(leftArrayIndex<middle && rightArrayIndex<end) {
            tempArray[tempIndex++] = array[leftArrayIndex] <= array[rightArrayIndex] ? array[leftArrayIndex++] : array[rightArrayIndex++];
        }

        System.arraycopy(array, leftArrayIndex, array, start + tempIndex, middle-leftArrayIndex);
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }

}
