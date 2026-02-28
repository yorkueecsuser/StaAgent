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

        // BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    }

    public Set<Person> showBug() {
        Set<Person> people = new HashSet<>();
        
        // Original loop
        int i = 0;
        while (i < 3) {
            if (i == 0) people.add(new Person("Alice", 30));
            if (i == 1) people.add(new Person("Bob", 25));
            if (i == 2) people.add(new Person("Alice", 30)); // This will not be added due to missing hashCode()
            i++;
        }

        // Mutated loop (Equivalent Loop Replacement)
        int j = 0;
        do {
            if (j == 0) people.add(new Person("Alice", 30));
            if (j == 1) people.add(new Person("Bob", 25));
            if (j == 2) people.add(new Person("Alice", 30)); // This will not be added due to missing hashCode()
            j++;
        } while (j < 3);

        return people;
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        Set<Person> result = example.showBug();
        System.out.println("Number of unique people: " + result.size());
    }
}