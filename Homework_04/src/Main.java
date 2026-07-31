//Домашняя работа 4
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int yourAge = 32;
        if (yourAge >= 18) {
            System.out.println("Ваш возраст равен " + yourAge + ". Вы совершеннолетний.");
        } else {
            System.out.println("Ваш возраст равен " + yourAge + ". Вы не достигли совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2");
        int airTemp = 8;
        if(airTemp < 5){
            System.out.println("На улице " + airTemp + " градусов. Нужно надеть шапку.");
        }
        if (airTemp > 5){
            System.out.println("На улице " + airTemp + " градусов. Можно идти без шапки.");
        }
        if(airTemp == 5) {
            System.out.println("На улице " + airTemp + " градусов. Сам решай.");
        }
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        int currentSpeed = 58;
        if (currentSpeed > 60){
            System.out.println("Ваша скорость " + currentSpeed + " км/ч. Придётся заплатить штраф.");
        } else {
            System.out.println("Ваша скорость " + currentSpeed + " км/ч. Можно ездить спокойно.");
        }
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        int personAge = 32;
        if (personAge >= 2 && personAge <= 6){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        }
        if (personAge >= 7 && personAge <= 17){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        }
        if (personAge >= 18 && personAge <= 24){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        }
        if (personAge > 24){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
        }
        System.out.println(" ");

        //Задача 5
        System.out.println("Задача 5");
        int childAge = 8;
        if (childAge < 5){
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        if (childAge >= 5 && childAge <= 14){
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (childAge > 14){
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println(" ");

        //Задача 6
        System.out.println("Задача 6");
        int sittingPax = 60;
        int standingPax = 41;
        boolean sits = sittingPax < 60;
        boolean stands = standingPax < (102 - 60);
        if(!sits && !stands){
            System.out.println("В вагоне нет свободных мест.");
        }
        if (sits){
            System.out.print("В вагоне есть сидячее место. ");
        }
        if (stands){
            System.out.println("В вагоне есть стоячее место.");
        }
        System.out.println(" ");

        //Задача 7
        System.out.println("Задача 7");
        int one = 5;
        int two = 12;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Число " + one + " самое большое");
        } else if (two > three){
            System.out.println("Число " + two + " самое большое");
        } else {
            System.out.println("Число " + three + " самое большое");
        }
    }
}