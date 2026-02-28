import java.util.HashSet;
import java.util.Set;

class HashCodeBugExample {

    // Class with equals() but no hashCode()
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass()!= obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }

        // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS) 

        // Introduced unreachable if-else statement
        public void someMethod() {
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This is reachable.");
            } else {
                System.out.println("This is unreachable.");
            }
        }

        private boolean getCondition() {
            return true; // Always returns true to ensure the else block is unreachable
        }
    }

    public Set<Person> showBug() {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 30)); // This will not be added due to missing hashCode()

        return people;
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        Set<Person> result = example.showBug();
        System.out.println("Number of unique people: " + result.size());

        // Call someMethod to demonstrate the unreachable if-else statement
        example.new Person("Test", 0).someMethod();
    }
}