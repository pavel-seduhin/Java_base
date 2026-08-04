//Домашняя работа 6
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println(" ");

        //Задача 5
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным.");
        }
        System.out.println(" ");

        //Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Задача 8
        System.out.println("Задача 8");
        int deposit = 29000;
        for (int i = 1; i <= 12; i++){
            int total = deposit * i;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println(" ");

        //Задача 9
        System.out.println("Задача 9");
        float contribution = 29000f;
        float total = 0f;
        int interest = 12;
        float interestPerMonth = (float) (interest / 100.0 / 12);
        for (int i = 1; i <= 12; i++){
            total = total + total * interestPerMonth + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        System.out.println(" ");

        //Задача 10
        System.out.println("Задача 10");
        int base = 2;
        for (int i = 1; i <= 10; i++){
            int mult = base * i;
            System.out.println(base + " * " + i + " = " + mult);
        }
    }
}