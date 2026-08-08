import java.util.Arrays;

//Домашняя работа 9
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("\nЗадача 1");
        int[] inputArray1 = {1800, 500, 2300, 2100, 1100};
        float[] outputArray1 = new float[4];
        int payoutSum = 0;
        int payoutMax = 0;
        int payoutMin = -1;
        float payoutAverage;
        for (int author : inputArray1) {
            if (author >= payoutMax) {
                payoutMax = author;
            }
            if (payoutMin < 0 || author < payoutMin) {
                payoutMin = author;
            }
            payoutSum = payoutSum + author;
        }
        payoutAverage = (float) (payoutSum / inputArray1.length);
        outputArray1[0] = payoutSum;
        outputArray1[1] = payoutMax;
        outputArray1[2] = payoutMin;
        outputArray1[3] = payoutAverage;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2");
        int[] inputArray2 = {63250, 68700, 57300, 59450, 62270};
        float[] outputArray2 = new float[inputArray2.length];
        int i = 0;
        for (int worker : inputArray2) {
            outputArray2[i] = (float) (worker / 100.0 * 13);
            i++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        int[] inputArray3 = {3800, 4300, 5600, 5100, 4600};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        i = 0;
        for (int bonus : inputArray3) {
            outputArray3[i] = bonus > 5000;
            i++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        int[] inputArray4 = {15689, 3684, 8267, -15, 2569};
        boolean[] outputArray4 = new boolean[inputArray4.length];
        i = 0;
        for (int balance : inputArray4) {
            outputArray4[i] = balance >= 0;
            if (!outputArray4[i]) {
                break;
            }
            i++;
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        System.out.println(" ");

        //Задача 5
        System.out.println("Задача 5");
        int[] inputArray5 = {45368, 23451, -1536, 0, 16874};
        char[] outputArray5 = new char[inputArray5.length];
        i = 0;
        int goodMonth = 0;
        for (int month : inputArray5) {
            if (month > 0) {
                outputArray5[i] = '+';
                goodMonth++;
            } else {
                outputArray5[i] = '-';
            }
            i++;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
        System.out.println("Всего рентабельных месяцев: " + goodMonth);
    }
}