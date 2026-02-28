import java.util.Objects;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // BUG: "equals" method overrides should accept "Object" parameters
    public boolean equals(Person p) {
        boolean result = this.name.equals(p.name);
        boolean result2 = this.name.equals(p.name);
        return this.name.equals(p.name);
    }

    public Object showBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        // This will return false due to the bug
        return p1.equals(p2);
    }
}