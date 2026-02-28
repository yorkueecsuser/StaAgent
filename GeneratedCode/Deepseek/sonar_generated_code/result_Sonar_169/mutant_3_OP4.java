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
        boolean result = p1.equals(p2);

        // Added an unreachable if-else statement
        if (false) {
            // This will never be executed, it's unreachable
            result = true;
        } else {
            // This will always be executed
            result = false;
        }

        return result;
    }   
}