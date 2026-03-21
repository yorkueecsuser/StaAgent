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
        boolean wzipkmod = false;while (wzipkmod && false && false && true && false && false && false && true && true && false && true && false) {float yxrnijhi = 719852704;}
        System.out.println(getName());
    
}

    public double getSalaryBug() { // Noncompliant; this is not an override
        return getSalary();
    }
}