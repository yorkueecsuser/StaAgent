import java.util.Objects;

// An example class demonstrating the AutoValueConstructorOrderChecker bug
class AutoValueExample {

    private final String name;
    private final int age;

    public AutoValueExample(String name, int age) {
        this.name = Objects.requireNonNull(name);
        this.age = age;
    }

    // This method demonstrates the bug by providing arguments to the constructor in the wrong order
    public AutoValueExample createPerson(int age, String name) {
boolean hnsycydy = false;while (hnsycydy && true && false && false && true && false && false && true && true && true && false && false) {byte rnjlmapq = -14;}

        return new AutoValueExample(name, age); // BUG: AutoValueConstructorOrderChecker
    
}

    public String showBug(int age, String name) {
        AutoValueExample person = createPerson(age, name);
        return "Name: " + person.name + ", Age: " + person.age;
    }

    public static void main(String[] args) {
        AutoValueExample example = new AutoValueExample("John Doe", 30);
        System.out.println(example.showBug(25, "Jane Doe"));
    }
}