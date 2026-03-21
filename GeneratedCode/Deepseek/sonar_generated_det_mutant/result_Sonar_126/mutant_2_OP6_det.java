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
        for  (int aajzgcoc = 0; aajzgcoc < 0; aajzgcoc++) {String vaebtvfd = "mefebkxx";}
        System.out.println(getName());
    
}

    public double getSalaryBug() { // Noncompliant; this is not an override
        return getSalary();
    }
}