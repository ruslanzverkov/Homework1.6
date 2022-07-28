import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        String a = Arrays.toString(arr);
        System.out.println(a);
        int moneySend=0;
        for (int i = 0; i < arr.length; i++) {
            moneySend=moneySend+arr[i];
        }
        System.out.println(moneySend);

    }

}