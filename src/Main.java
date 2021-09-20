public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 30, -5, 50, 152, -1, 87};

        Factorial factorial = new Factorial();
        System.out.println(factorial.iterativeFactorial(5));

        System.out.println(factorial.recursiveFactorial(5));

//        for(int i=0; i<intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
    }
}
