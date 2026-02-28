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

    // Mutation: Renaming the argument in "equals" method
    public boolean equals(Object p) {
        if(p instanceof Person) {
            return this.name.equals(((Person)p).name);
        }
        return false;
    }   
}