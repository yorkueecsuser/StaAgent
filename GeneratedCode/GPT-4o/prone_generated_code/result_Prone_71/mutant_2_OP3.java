import java.util.TreeSet;

class IncomparableExample {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public void showBug() {
        TreeSet<Person> people = new TreeSet<>(); // BUG: Incomparable
        people.add(new Person("Alice", 30)); // BUG: Incomparable
        people.add(new Person("Bob", 25)); // BUG: Incomparable
        people.add(new Person("Charlie", 35)); // BUG: Incomparable

        System.out.println(people);

        // Adding an unreachable if statement based on a dynamic condition
        boolean alwaysFalseCondition = getCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to return a condition that is always false
    private boolean getCondition() {
        return false; // This ensures the condition is false at runtime
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}