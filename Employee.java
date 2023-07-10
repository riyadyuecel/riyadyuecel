public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {

        double tax;
        if (this.salary < 1000) {
            return 0;
        } else {
            tax = this.salary * 0.03;
            return tax;
        }
    }

    public double bonus() {
        int extraHours;
        if (this.workHours > 40) {
            extraHours = this.workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double increaseSalary() {
        int year = 2021;
        int workYears = year - this.hireYear;
        double increaseSalary;

        if (workYears < 10) {
            increaseSalary = this.salary * 0.05;
            return increaseSalary;
        }
        if ((workYears >= 10) && (workYears < 20)) {
            increaseSalary = this.salary * 0.10;
            return increaseSalary;
        }
        if (workYears >= 20) {
            increaseSalary = this.salary * 0.15;
            return increaseSalary;
        }
        return 0;

    }

    void printInfo() {
        System.out.println("======================");
        System.out.println("Adı :\t" + this.name);
        System.out.println("Maaşı :\t" + this.salary);
        System.out.println("Çalışma Saati :\t" + this.workHours);
        System.out.println("Başlangıç Yılı :\t" + this.hireYear);
        System.out.println("Vergi :\t" + this.tax());
        System.out.println("Bonus :\t" + this.bonus());
        System.out.println("Maaş Artışı :\t" + this.increaseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaş :\t" + (this.salary + this.bonus() - this.tax()));
        System.out.println("Toplam Maaş :\t" + (this.salary + this.increaseSalary()));
    }
}


