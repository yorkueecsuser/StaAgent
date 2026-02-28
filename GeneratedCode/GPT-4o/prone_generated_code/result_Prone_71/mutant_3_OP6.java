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

    private boolean getFalseCondition() {
        return false;
    }

    private void insertUnreachableLoop() {
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable");
        }
    }

    public void showBug() {
        TreeSet<Person> people = new TreeSet<>(); // BUG: Incomparable
        people.add(new Person("Alice", 30)); // BUG: Incomparable
        people.add(new Person("Bob", 25)); // BUG: Incomparable
        people.add(new Person("Charlie", 35)); // BUG: Incomparable

        System.out.println(people);

        // Calling the method with the unreachable loop
        insertUnreachableLoop();
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}