//Домашняя работа 3
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int varInteger = 1594367;
        byte varByte = -106;
        short varShort = 17498;
        long varLong = -37915698257L;
        float varFloat = 5.17f;
        double varDouble = -2.56894172;
        System.out.println("Значение переменной varInteger с типом int равно " + varInteger);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        //Для того чтобы IDE не ругалась на неиспользованные переменные, выведу в столбик все их значения
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        byte firstTeacherQty = 23;
        byte secondTeacherQty = 27;
        byte thirdTeacherQty = 30;
        short paperQty = 480;
        byte paperPerStudent = (byte) (paperQty / (firstTeacherQty + secondTeacherQty + thirdTeacherQty));
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        byte workTimeUnit = 2;
        byte workTimeUnitEff = 16;
        byte effPerMinute = (byte) (workTimeUnitEff / workTimeUnit);
        short effPer20Minutes = (short) (20 * effPerMinute);
        int effPerDay = 24 * 60 * effPerMinute;
        int effPer3Days = 3 * effPerDay;
        int effPerMonth = 30 * effPerDay;
        System.out.println("За 20 минут машина произвела " + effPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + effPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + effPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + effPerMonth + " штук бутылок");
        System.out.println(" ");

        //Задача 5
        System.out.println("Задача 5");
        byte allPaintQty = 120;
        byte whitePerRoom = 2;
        byte brownPerRoom = 4;
        byte paintPerRoom = (byte) (whitePerRoom + brownPerRoom);
        byte roomsQty = (byte) (allPaintQty / paintPerRoom);
        byte whiteQty = (byte) (roomsQty * whitePerRoom);
        byte brownQty = (byte) (roomsQty * brownPerRoom);
        System.out.println("В школе, где " + roomsQty + " классов, нужно " + whiteQty + " банок белой краски и " + brownQty + " банок коричневой краски.");
        System.out.println(" ");

        //Задача 6
        System.out.println("Задача 6");
        byte bananaUnitWeight = 80;
        float milkOneMlWeight = 105f / 100;
        byte iceCreamUnitWeight = 100;
        byte eggWeight = 70;
        float breakfastWeightGr = (5 * bananaUnitWeight) + (200 * milkOneMlWeight) + (2 * iceCreamUnitWeight) + (4 * eggWeight);
        float breakfastWeightKg = breakfastWeightGr / 1000;
        System.out.println("Вес спортивного завтрака " + breakfastWeightGr + " грамм или " + breakfastWeightKg + " килограмм.");
        System.out.println(" ");

        //Задача 7
        System.out.println("Задача 7");
        short excessWeight = 7000;
        short minWeightLoss = 250;
        short maxWeightLoss = 500;
        byte minDaysToLose = (byte) (excessWeight / maxWeightLoss);
        byte maxDaysToLose = (byte) (excessWeight / minWeightLoss);
        byte averageDaysToLose = (byte) ((minDaysToLose + maxDaysToLose) / 2);
        System.out.println("На то, чтобы сбросить вес, уйдёт минимум " + minDaysToLose + ", максимум " + maxDaysToLose + ", а в среднем " + averageDaysToLose + " день.");
        System.out.println(" ");

        //Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float annualGrowthRate = 1.1f;
        int newSalaryMasha = (int) (salaryMasha * annualGrowthRate);
        int newSalaryDenis = (int) (salaryDenis * annualGrowthRate);
        int newSalaryKristina = (int) (salaryKristina * annualGrowthRate);
        int annualGrowthMasha = (newSalaryMasha - salaryMasha) * 12;
        int annualGrowthDenis = (newSalaryDenis - salaryDenis) * 12;
        int annualGrowthKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualGrowthMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualGrowthDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualGrowthKristina + " рублей.");
    }
}