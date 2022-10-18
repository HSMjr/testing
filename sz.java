class employee {
    public String name;
    public int emp_id;
    public int salary;

    employee() {// default constructor
        name = null;
        emp_id = 0;
        salary = 0;
    }

    employee(String name, int emp_id, int salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    String GetName() {
        return this.name;
    }

    int GetSalary() {
        return this.salary;
    }

    void IncSalary(int percent) {
        this.salary += ((0.01 * percent) * this.salary);
    }

}

class Manager extends employee {
    public String department;

    Manager(String name, int emp_id, int salary, String department) {
        super(name, emp_id, salary);
        this.department = department;
    }
}

public class sz {
    public static void main(String args[]) {
        Manager obj = new Manager("MANAV", 50009188, 40000, "tech");
        String name = obj.GetName();
        System.out.println("\nName Through GetName() : " + name);
        int sal = obj.GetSalary();
        System.out.println("Salary Through GatSalary() : " + sal);
        // changing salary now
        obj.IncSalary(4);
        int change_sal = obj.GetSalary();
        System.out.println("Changed Salary : " + change_sal);
        System.out.println(
                "\n------------------------------------------\n*** Manager INFO <not accessed>*** \nEmp_ID : "
                        + obj.emp_id + "\nDepartment :" + obj.department +
                        "\n\n------------------------------------------\n");
    }
}
