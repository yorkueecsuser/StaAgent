import java.util.Objects;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public boolean equals(Person p) {
        return this.name.equals(p.name);
    }

    public Object showBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        // This will return false due to the bug
        return p1.equals(p2);
    }

    public boolean getCondition() {
        return false;
    }

    public void mutation() {
        for (boolean condition = getCondition(); condition; condition = getCondition()) {
            System.out.println("This is an unreachable loop"); // This line will never be executed
        }
    }
}