//Курсовая работа

public class Main {
    public static void main(String[] args) {

        //Создание объектов
        Employee employee1 = new Employee("ABC", 2, 400);
        Employee employee2 = new Employee("DEF", 1, 250);
        Employee employee3 = new Employee("BAC", 4, 300);
        Employee employee4 = new Employee("GHI", 3, 75);
        Employee employee5 = new Employee("FED", 5, 110);
        Employee employee6 = new Employee("IGH", 3, 320);
        Employee employee7 = new Employee("CBA", 1, 425);
        Employee employee8 = new Employee("EFD", 5, 90);
        Employee employee9 = new Employee("HIG", 2, 270);
        Employee employee10 = new Employee("FDE", 4, 210);
        Employee employee11 = new Employee("CAB", 2, 140);

        //Поиск свободных ячеек массива и заполнение их объектами
        System.out.println("Поиск свободных ячеек массива и заполнение их объектами");
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee1));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee2));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee3));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee4));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee5));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee6));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee7));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee8));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee9));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee10));
        System.out.println(EmployeeBook.searchForFreeAndAdd(employee11));

        System.out.println(" ");

        //Список всех сотрудников
        System.out.println("Список всех сотрудников");
        EmployeeBook.printEmployeeBook();

        System.out.println(" ");

        //Подсчёт средней зарплаты
        System.out.println("Подсчёт средней зарплаты");
        EmployeeBook.printAverageSalary();

        System.out.println(" ");

        //Расчёт значения налогов
        System.out.println("Расчёт значения налогов");
        EmployeeBook.calculateTaxes("PROPORTIONAL");
        EmployeeBook.calculateTaxes("PROGRESSIVE");

        System.out.println(" ");

        //Индексация зарплат в выбранном отделе
        System.out.println("Индексация зарплат в выбранном отделе");
        EmployeeBook.indexWageInDept(3, 20);

        System.out.println(" ");

        //Поиск первого сотрудника указанного отдела с зарплатой
        //выше указанной
        System.out.println("Поиск первого сотрудника указанного отдела с зарплатой\nвыше указанной");
        EmployeeBook.searchByDeptSalary(3, 300);

        System.out.println(" ");

        //Поиск не самых высокооплачиваемых сотрудников
        System.out.println("Поиск не самых высокооплачиваемых сотрудников");
        EmployeeBook.printPoorEmployees(350, 3);

        System.out.println(" ");

        //Проверка наличия указанного сотрудника в массиве
        System.out.println("Проверка наличия указанного сотрудника в массиве");
        System.out.println(EmployeeBook.checkPresence(employee7));

        System.out.println(" ");

        //Поиск сотрудника по id
        System.out.println("Поиск сотрудника по id");
        EmployeeBook.searchByID(5);
    }
}