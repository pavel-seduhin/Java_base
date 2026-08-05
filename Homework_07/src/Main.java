//Домашняя работа 7
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int firstFriday = 4;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2, версия 1");
        int distance = 1;
        int cut = 1;
        do {
            if (distance % 500 == 0) {
                System.out.println(cut + ". Держитесь! Осталось " + (42195 - distance) + " метров.");
                cut++;
            }
            distance++;
        }
        while (distance <= 42195);
        System.out.println(" ");

        System.out.println("Задача 2, версия 2");

        distance = 1;
        cut = 1;
        for (; distance <= 42195; distance++) {
            if (distance % 500 == 0) {
                System.out.println(cut + ". Держитесь! Осталось " + (42195 - distance) + " метров.");
                cut++;
            }
        }
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3, версия 1");
        int prepayment = 5000;
        int days = 1;
        while (prepayment > 0) {
            days++;
            if (days % 5 == 0) {
                continue;
            }
            prepayment = prepayment - 100;
        }
        System.out.println("Продолжительность парковки - " + days + " дн.");
        System.out.println(" ");

        System.out.println("Задача 3, версия 2");
        prepayment = 5000;
        days = 1;
        for ( ; ; days++) {
            if (days % 5 == 0) {
                continue;
            }
            if(prepayment > 0) {
                prepayment = prepayment - 100;
            } else {
                break;
            }
        }
        System.out.println("Продолжительность парковки - " + days + " дн.");
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        int targetSum = 12_000_000;
        int monthlyFee = 15_000;
        int month = 0;
        int total = 0;
        while (true) {
            if (month % 6 == 0) {
                total = total + total / 100 * 7;
            }
            total = total + monthlyFee;
            if (total >= targetSum) {
                break;
            } else {
                month++;
            }
        }
        System.out.println("Для накопления целевой суммы потребуется " + month + " мес.");
        System.out.println(" ");

        //Задача 5
        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            if (minute % 10 == 0) {
                overheats++;
                minute = minute + 2;
                continue;
            }
            if (overheats > 3) {
                System.out.println("Зарядка прекращена. Текущий заряд " + charge + "%");
                break;
            }
            minute++;
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " мин.");
    }
}