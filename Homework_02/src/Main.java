//Домашняя работа 2
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        //Задача 2
        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        //Задача 3
        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println(" ");

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println(" ");

        //Задача 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        var diffBoxersWeight = Math.abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("Общая масса боксёров - " + sumBoxersWeight + " кг.");
        System.out.println("Разница между массами боксёров - " + diffBoxersWeight + " кг.");
        System.out.println(" ");

        //Задача 7
        System.out.println("Задача 7");
        var remainAfterDiv = secondBoxerWeight % firstBoxerWeight;
        System.out.println(remainAfterDiv);
        System.out.println(" ");

        //Задача 8
        System.out.println("Задача 8");
        var genWorkingHours = 640;
        var oneWorkersHours = 8;
        var numOfWorkers = genWorkingHours / oneWorkersHours;
        System.out.println("Всего в компании - " + numOfWorkers + " человек");
        var newNumOfWorkers = numOfWorkers + 94;
        var possibleWorkingHours = newNumOfWorkers * oneWorkersHours;
        System.out.println("Если в компании работает " + newNumOfWorkers + " человек, то всего " + possibleWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}