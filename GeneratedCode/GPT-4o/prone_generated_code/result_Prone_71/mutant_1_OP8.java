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
    }

    public static void main(String[] args) {
        IncomparableExample example = new IncomparableExample();
        example.showBug();
    }
}

// Mutant Code below
class IncomparableExampleMutant {

    static class Person {
        String n; // 'name' renamed to 'n'
        int age;

        Person(String n, int age) {
            this.n = n;
            this.age = age;
        }

        @Override
        public String toString() {
            return n + " (" + age + ")";
        }
    }

    public void showBug() {
        TreeSet<Person> p = new TreeSet<>(); // 'people' renamed to 'p'
        p.add(new Person("Alice", 30));
        p.add(new Person("Bob", 25));
        p.add(new Person("Charlie", 35));

        System.out.println(p);
    }

    public static void main(String[] args) {
        IncomparableExampleMutant ex = new IncomparableExampleMutant(); // 'example' renamed to 'ex'
        ex.showBug();
    }
}