import java.util.Objects;

class Person {
    String name;
    boolean unreachableCondition;

    Person(String name) {
        this.name = name;
        this.unreachableCondition = false;
    }

    public boolean equals(Object p) {
        if (p instanceof Person) {
            Person other = (Person) p;
            return this.name.equals(other.name);
        }
        return false;
    }

    public Object showBug() {
        Person p1 = new Person("John");
        Person p2 = new Person("John");

        // This will return false due to the bug
        boolean result = p1.equals(p2);
        
        switch (unreachableCondition) {
            case true:
                // unreachable code
                break;
            case false:
                // reachable code
                break;
        }

        return result;
    }   
}