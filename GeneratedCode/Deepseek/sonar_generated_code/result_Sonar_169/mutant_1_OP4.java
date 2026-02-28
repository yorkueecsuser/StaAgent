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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return Objects.equals(name, p.name);
    }

    public void unreachableCode() {
        if(false) {
            Person p1 = new Person("John");
            Person p2 = new Person("John");

            p1.equals(p2);
        } else {
            // Here is the unreachable code
            Person p1 = new Person("John");
            Person p2 = new Person("John");

            p1.equals(p2);
        }
    }
}