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

        // Introducing an unreachable if-else statement
        boolean isConditionMet = checkCondition(); // this will always return false
        if (isConditionMet) {
            System.out.println("This will never be printed.");
        } else {
            // Original code remains reachable
            System.out.println(people);
        }
    }

    private boolean checkCondition() {
        return false; // condition that always evaluates to false
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}