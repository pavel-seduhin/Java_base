//Домашняя работа 8

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int[] arrFirst = new int[3];
        arrFirst[0] = 1;
        arrFirst[1] = 2;
        arrFirst[2] = 3;

        float[] arrSecond = {1.57f, 7.654f, 9.986f};

        char[] arrThird = {'a', 'b', 'c', 'd', 'f'};
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            if (i == 2){
                System.out.println(arrFirst[i]);
                break;
            }
            System.out.print(arrFirst[i] + ", ");
        }

        for (int i = 0; i < 3; i++){
            if (i == arrSecond.length - 1){
                System.out.println(arrSecond[i]);
                break;
            }
            System.out.print(arrSecond[i] + ", ");
        }

        for (int i = 0; i < arrThird.length; i++){
            if (i == arrThird.length - 1){
                System.out.println(arrThird[i]);
                break;
            }
            System.out.print(arrThird[i] + ", ");
        }
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i--) {
            if (i == 0){
                System.out.println(arrFirst[i]);
                break;
            }
            System.out.print(arrFirst[i] + ", ");
        }

        for (int i = 2; i >= 0; i--){
            if (i == 0){
                System.out.println(arrSecond[i]);
                break;
            }
            System.out.print(arrSecond[i] + ", ");
        }

        for (int i = arrThird.length - 1; i >= 0 ; i--){
            if (i == 0){
                System.out.println(arrThird[i]);
                break;
            }
            System.out.print(arrThird[i] + ", ");
        }
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < arrFirst.length; i++) {
            if ((arrFirst[i] % 2) != 0){
                arrFirst[i] ++;
            }
        }
        System.out.println(Arrays.toString(arrFirst));
    }
}
