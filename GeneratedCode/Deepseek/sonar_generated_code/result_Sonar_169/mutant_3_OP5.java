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

    public boolean shouldRun() {
        boolean condition = true;
        if (condition) {
            switch (0) {
                case 1:
                    break;
            }
        }
        return true;
    }

    public Object showNoBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        // This will return true as the mutation has been introduced.
        return p1.equals(p2);
    }
}