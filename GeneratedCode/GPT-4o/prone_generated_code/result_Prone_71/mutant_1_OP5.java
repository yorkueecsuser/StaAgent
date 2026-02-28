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

        // Unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // This will always return a value that doesn't match the case
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never execute.");
                break;
            default:
                // No action needed
                break;
        }

        System.out.println(people);
    }

    private int getUnreachableCondition() {
        return 0; // Always returns 0, but no case for 0 in the switch
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}