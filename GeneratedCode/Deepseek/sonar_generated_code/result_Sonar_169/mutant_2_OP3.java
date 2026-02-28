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

    // Mutant Code: Adding unreachable if statement
    public Object showBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");
        if (false) { // this is the mutant code
            // This will return false due to the bug
            return p1.equals(p2);
        }
        return null; // ensure code is reachable
    }   
}