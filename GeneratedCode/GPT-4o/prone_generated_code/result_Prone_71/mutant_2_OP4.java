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

        // Unreachable if-else statement added
        boolean isConditionMet = getUnreachableCondition();
        if (isConditionMet) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This is the else branch");
        }

        System.out.println(people);
    }

    // Method to return a condition for the unreachable if statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}