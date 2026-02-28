import java.util.Comparator;

class CompareToBug {
    public static class Person implements Comparable<Person> {
        private int age;

        public Person(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            if (this.age < other.age) { // BUG: "compareTo" results should not be checked for specific values
                return -1;
            } else if (this.age > other.age) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static boolean isEqual(Person p1, Person p2) {
        return p1.compareTo(p2) == 0; // BUG: comparing compareTo result to specific value
    }

    public static void showBug() {
        Person person1 = new Person(30);
        Person person2 = new Person(30);
        System.out.println("Bug: " + isEqual(person1, person2));
    }

    public static void main(String[] args) {
        showBug();
    }
}