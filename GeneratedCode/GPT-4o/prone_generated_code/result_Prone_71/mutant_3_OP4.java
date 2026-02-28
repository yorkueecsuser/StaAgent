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

        // Mutant: Adding an unreachable if-else branch
        boolean condition = getCondition(); // Using a method to avoid compilation-time constant
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable else branch.");
        }

        System.out.println(people);
    }

    private boolean getCondition() {
        return false; // This method simulates a condition that is always false
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}