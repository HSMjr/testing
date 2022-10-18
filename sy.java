class worker {
    public String name;
    public int salary_rate;

    worker() {
        name = null;
        salary_rate = 0;
    }

    worker(String namne, int salary_rate) {
        this.name = namne;
        this.salary_rate = salary_rate;
    }
}

class DailyWorker extends worker {
    public int salary;

    DailyWorker(String namne, int salary_rate) {
        super(namne, salary_rate);
        this.salary = 0;
    }

    int Compay(int hr) {
        salary = 40 * salary_rate;
        return salary;
    }
}

class SalariedWorker extends worker {
    public int salary;

    SalariedWorker(String namne, int salary_rate) {
        super(namne, salary_rate);
        this.salary = 0;
    }

    int Compay(int hr) {
        salary = 40 * salary_rate;
        return salary;
    }
}

public class sy {
    public static void main(String args[]) {
        DailyWorker obj1 = new DailyWorker("Akash", 4000);
        SalariedWorker obj2 = new SalariedWorker("Aryan ", 8000);

        int a = obj1.Compay(34);
        int b = obj2.Compay(70);
        System.out
                .println("\t***** DailyWorker INFO ***** \nName : " + obj1.name + "\nSalary rate :" + obj1.salary_rate +
                        "\n\n------------------------------------------\n");
        System.out.println(
                "\t***** SalariedWorker INFO ***** \nName : " + obj2.name + "\nSalary rate :" + obj2.salary_rate +
                        "\n\n------------------------------------------\n");
        System.out.println("\nDailyWorker Compay: " + a + "\nSalariedWorker Compay:" + b + "\n\n");

    }

}
