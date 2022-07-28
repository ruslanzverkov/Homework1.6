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

//        Первое задание

        int[] arr = generateRandomArray();
        String a = Arrays.toString(arr);
        System.out.println(a);

        int moneySend=0;
        for (int i = 0; i < arr.length; i++) {
            moneySend+=arr[i];
        }
        System.out.println(moneySend);

        int moneySend1=0;
        for (int i : arr) {
            moneySend1+=i;
        }
        System.out.println(moneySend1);

//        Второе задание
        Arrays.sort(arr);
        System.out.println("Максимальная сумма трат за день составила"+arr[arr.length-1]+" рублей");
        System.out.println("Минимальная сумма трат за день составила"+arr[0]+"рублей");

        int moneyMax = 0;
        int moneyMin=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>moneyMax) {
                moneyMax = arr[i];
            } else if (arr[i] < moneyMin) {
                moneyMin = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила" + moneyMax + "рублей");
        System.out.println("Минимальная сумма трат за день составила" + moneyMin + "рублей");

//        Третье задание


        int averageSalary=0;    //=moneySend/arr.length;// смотри 1е задание
        int moneySend3=0;
        for (int i = 0; i < arr.length; i++) {
            moneySend3+=arr[i];
            averageSalary=moneySend3/arr.length;
        }
        System.out.println(averageSalary);

//        Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

}