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

        // Unreachable for loop
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This is unreachable code");
        }

        System.out.println(people);
    }

    private boolean getLoopCondition() {
        return false; // This method simulates a condition that is always false
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}