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

        // Introducing unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 999: // This case is designed to be unreachable
                System.out.println("This should never be printed.");
                break;
            default:
                // No operation, making the switch effectively unreachable
                break;
        }

        System.out.println(people);
    }

    // Helper method to ensure non-constant value for switch
    private int getUnreachableSwitchValue() {
        return -1; // Always returns a value not matching any case
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}