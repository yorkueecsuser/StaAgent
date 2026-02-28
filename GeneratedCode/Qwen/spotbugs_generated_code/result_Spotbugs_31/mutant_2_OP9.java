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
        int i = 0;
        String[] names = {"Alice", "Bob", "Alice"};
        int[] ages = {30, 25, 30};

        // Original while loop
        while (i < names.length) {
            people.add(new Person(names[i], ages[i]));
            i++;
        }

        // Equivalent do-while loop
        i = 0;
        do {
            people.add(new Person(names[i], ages[i]));
            i++;
        } while (i < names.length);

        return people;
    }

    public static void main(String[] args) {
        HashCodeBugExample example = new HashCodeBugExample();
        Set<Person> result = example.showBug();
        System.out.println("Number of unique people: " + result.size());
    }
}