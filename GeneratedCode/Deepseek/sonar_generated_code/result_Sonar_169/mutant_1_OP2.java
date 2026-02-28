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
        Person p1_duplicated = p1;

        return p1.equals(p2);
    }   
}