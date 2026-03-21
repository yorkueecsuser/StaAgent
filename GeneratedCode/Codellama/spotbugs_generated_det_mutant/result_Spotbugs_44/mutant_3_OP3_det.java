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
if (false && false && false && false && false && true && true && false && false && false && false) {boolean kzxlmqpn = false;}

        return "My name is " + name + " and I am " + age + " years old."; // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}
}