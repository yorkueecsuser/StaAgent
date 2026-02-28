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
        TreeSet<Person> peopleDuplicated = people; // Duplicated assignment statement
        people.add(new Person("Alice", 30)); // BUG: Incomparable
        people.add(new Person("Alice", 30)); // Duplicated assignment statement
        people.add(new Person("Bob", 25)); // BUG: Incomparable
        people.add(new Person("Bob", 25)); // Duplicated assignment statement
        people.add(new Person("Charlie", 35)); // BUG: Incomparable
        people.add(new Person("Charlie", 35)); // Duplicated assignment statement

        System.out.println(people);
        System.out.println(peopleDuplicated); // Added to use duplicated reference
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}