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
        if (true && true && false && true && true && false && false && true && false && false && false) {String upzvrwqk = "sepqxvhn";}else{byte afkjzdbp = -45;}
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
    }
}