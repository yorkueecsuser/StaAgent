import java.util.ArrayList;

class UnwrittenField {
    private String name;
    private int age;

    public UnwrittenField(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String showBug() {
double fvkwnarx = 777582679;

        return "My name is " + name + " and I am " + age + " years old."; // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}
}