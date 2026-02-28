import java.util.Objects;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // BUG: "equals" method overrides should accept "Object" parameters
    public boolean equals(Person p) {
        return this.name.equals(p.name);
    }

    public Object showBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        // This will return false due to the bug
        return p1.equals(p2);
    }

    // Mutated code - Unreachable while loop
    boolean getCondition() {
        return false;
    }

    void mutatedMethod() {
        while (getCondition()) {
            // This while loop is unreachable due to the bug
            System.out.println("Unreachable code");
        }
    }
}