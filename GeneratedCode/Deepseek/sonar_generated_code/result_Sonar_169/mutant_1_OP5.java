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

    // Mutant code to introduce unreachable switch statement
    public Object showMutant() {
        int mutation = 0;
        switch(mutation) {
            case 1:
                // This will never be executed, hence making the switch statement unreachable
                return "Unreachable";
            default:
                break;
        }
        return "Reachable";
    }
}