public class Employee {
    private String name;
    private int dept;
    private int salary;
    private int id;

    private static int idCount = 0;

    public Employee(String name, int dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.id = ++idCount;
    }

    public String getName() { return this.name; }

    public int getDept() { return this.dept; }

    public int getSalary() { return this.salary; }

    public int getId() { return this.id; }

    public void setDept(int dept) { this.dept = dept; }

    public void setSalary(int salary) { this.salary = salary; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return this.salary == employee.salary;
    }

    @Override
    public String toString() {
        return this.id + "  Сотрудник " + this.name + "  Отдел №" + this.dept + "  Зарплата " + this.salary;
    }

    public void printShortInfo() {
        System.out.println("Сотрудник " + this.name + "  Зарплата " + this.salary);
    }


}
