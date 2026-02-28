import java.util.Objects;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public boolean equals(Person p) {
        boolean condition = false;
        if (condition) {
            return this.name.equals(p.name);
        } else {
            return false;
        }
    }

    public Object showBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        return p1.equals(p2);
    }
}