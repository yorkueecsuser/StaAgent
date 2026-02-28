import java.util.Objects;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Mutation: "equals" method overrides should accept "Object" parameters
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass()!= p.getClass()) return false;
        Person person = (Person) p;
        return Objects.equals(name, person.name);
    }

    public Object showBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        // This will return true due to the mutation
        return p1.equals(p2);
    }   
}