//Домашняя работа 5
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Выберите правильную операционную систему вашего телефона.");
        }
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2010;
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Выберите правильную операционную систему и год выпуска вашего телефона.");
        }
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        int year = 1784;
        boolean everyFourth = (year % 4) == 0;
        boolean everyCentury = (year % 100) == 0;
        boolean everyFourthCentury = (year % 400) == 0;
        if (year < 1584){
            System.out.println("Тогда ещё не было високосных годов.");
        } else if (!everyFourth || (everyCentury && !everyFourthCentury)) {
            System.out.println("Это не високосный год.");
        } else {
            System.out.println("Это високосный год.");
        }
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance > 100){
            System.out.println("На такое расстояние доставки нет");
        } else if (deliveryDistance <= 20){
            deliveryTime = 1;
        } else if (deliveryDistance <= 60){
            deliveryTime = 2;
        } else {
            deliveryTime = 3;
        }
        System.out.println("Потребуется дней: " + deliveryTime);
        System.out.println(" ");

        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 13;
        if (monthNumber < 1 || monthNumber > 12){
            System.out.println("Такого месяца не существует.");
        } else switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
        }
        System.out.println(" ");
    }
}