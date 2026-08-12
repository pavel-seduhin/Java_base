// Домашняя работа 11

import java.time.LocalDate;

public class Main {

    public static String isLeapYear(int year) {
        boolean everyFourth = (year % 4) == 0;
        boolean everyCentury = (year % 100) == 0;
        boolean everyFourthCentury = (year % 400) == 0;
        if (year < 1584){
            return " - тогда ещё не было високосных годов.";
        } else if (!everyFourth || (everyCentury && !everyFourthCentury)) {
            return " год - не високосный.";
        } else {
            return " год - високосный.";
        }
    }

    public static String offerRightLink(int year, int os) {
        int currentYear = LocalDate.now().getYear();
        String osName;
        String lightVersion;
        if (year <= currentYear && (os == 0 || os == 1)) {
            if (os == 1) {
                osName = "Android";
            } else {
                osName = "iOS";
            }
            if (year < 2015) {
                lightVersion = " облегчённую ";
            } else {
                lightVersion = " ";
            }
            return ("Установите" + lightVersion + "версию приложения для " + osName + " по ссылке.");
        } else {
            return ("Выберите правильную операционную систему и год выпуска вашего телефона.");
        }
    }

    public static String deliverOnTime(int distance) {
        int days;
        if (distance > 100) {
            return "На такое расстояние доставки нет";
        } else if (distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else {
            days = 3;
        }
        return ("Потребуется дней: " + days);
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int yearToChek = 2021;
        System.out.println(yearToChek + isLeapYear(yearToChek));
    }

    public static void task2 (){
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientDeviceOS = 0;
        System.out.println(offerRightLink(clientDeviceYear, clientDeviceOS));
    }

    public static void task3 (){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        System.out.println(deliverOnTime(deliveryDistance));
    }

    public static void separator() {
        System.out.println(" ");
    }

    public static void main(String[] args) {
        separator();
        task1(); //Задача 1
        separator();
        task2(); //задача 2
        separator();
        task3(); //Задача 3
    }
}