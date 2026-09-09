public class EmployeeBook {
    private static Employee[] employeeBook = new Employee[10];
    private static int i = 0;

    public static  void makeEmployeeBook(Employee employee) {
            employeeBook[i] = employee;
            i++;
    }

    //Список всех сотрудников
    public static void printEmployeeBook() {
        for (Employee record : employeeBook) {
            if (record == null) {
                break;
            }
            System.out.println(record);
        }
    }

    //Расчёт средней зарплаты
    public static void printAverageSalary() {
        int sumSalary = 0;
        int employeeCount = 0;
        for (Employee record : employeeBook) {
            if (record == null) {
                break;
            }
            sumSalary = sumSalary + record.getSalary();
            employeeCount++;
        }
        System.out.println("Средняя зарплата - " + sumSalary / employeeCount);
    }

    //Расчёт значения налогов
    public static void calculateTaxes(String taxType) {
        System.out.println(taxType);
        float taxVolume = 0.0f;
        for (Employee record : employeeBook) {
            if (record == null) {
                break;
            }
            switch (taxType) {
                case "PROPORTIONAL":
                    taxVolume = 0.13f;
                    break;
                case "PROGRESSIVE":
                    if (record.getSalary() <= 150) {
                        taxVolume = 0.13f;
                    } else if (record.getSalary() <= 350) {
                        taxVolume = 0.17f;
                    } else {
                        taxVolume = 0.21f;
                    }
            }
            System.out.println(record.getId() + " " + record.getName() + " " + "Сумма налога " + String.format("%.2f", (record.getSalary() * taxVolume)));
        }
    }

    //Индексация зарплат в выбранном отделе
    public static void indexWageInDept(int dept, float index) {
        int newSalary;
        index = index / 100 + 1;
        for (Employee record : employeeBook) {
            if (record == null) {
                break;
            }
            if (record.getDept() != dept) {
                continue;
            }
            newSalary = (int)(record.getSalary() * index );
            record.setSalary(newSalary);
            System.out.println(record);
        }
    }

    //Поиск первого сотрудника указанного отдела с зарплатой
    //выше указанной
    public static void searchByDeptSalary(int dept, int salary) {
        for (Employee record : employeeBook) {
            if (record == null) {
                break;
            }
            if (record.getDept() == dept && record.getSalary() > salary) {
                record.printShortInfo();
                break;
            }
        }
    }

    //Поиск не самых высокооплачиваемых сотрудников
    public static void printPoorEmployees(int wage, int employeeNumber) {
        int poorQnt = 0;
        for (Employee record : employeeBook) {
            while (poorQnt < employeeNumber) {
                if (record.getSalary() < wage) {
                    System.out.println(record);
                    poorQnt++;
                }
                break;
            }
        }
    }

    //Проверка наличия указанного сотрудника в массиве
    public static boolean checkPresence(Employee wantedEmpl) {
        if (wantedEmpl == null) {
            return false;
        }
        for (Employee record : employeeBook) {
            if (record.equals(wantedEmpl)){
                return true;
            }
        }
        return false;
    }

    //Поиск свободных ячеек массива и заполнение их объектами
    public static boolean searchForFreeAndAdd(Employee newRecord) {
        for (Employee record : employeeBook) {
            if (record == null) {
                makeEmployeeBook(newRecord);
                return true;
            }
        }
        return false;
    }

    //Поиск сотрудника по id
    public static void searchByID(int wantedID) {
        if (wantedID > employeeBook.length) {
            System.out.println("Не найден такой id");
        } else {
            for (Employee record : employeeBook) {
                if (record.getId() == wantedID) {
                    System.out.println(record);
                    break;
                }
            }
        }
    }
}
