import java.util.Arrays;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() { // BUG: Child class methods named for parent class methods should be overrides
        return this.salary;
    }

    public void showBug() {
        int wbkixqgr = 0;switch  (wbkixqgr) {case 1:boolean yzupjiud = false;break;default:char wsxtbhti = 'z';break;}
        System.out.println(getName());
    
}

    public double getSalaryBug() { // Noncompliant; this is not an override
        return getSalary();
    }
}