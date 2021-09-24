public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 30, -5, 50, 152, -1, 87};

        QuickSorter quickSorter = new QuickSorter();
        quickSorter.sort(intArray, 0, intArray.length);

        for(int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
