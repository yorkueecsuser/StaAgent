import java.util.Arrays;

class RecordBugDemo {

    record Person(String[] names, int age) {
        // Overriding equals method for arrays
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Person)) return false;
            Person other = (Person) obj;
            return Arrays.equals(names, other.names) && age == other.age;
        }
    }

    public boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable.");
        }

        return person1.equals(person2);
    }

    // Dummy method to simulate dynamic condition
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RecordBugDemo demo = new RecordBugDemo();
        
        // Create two different Person objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will now print 'true' because the custom equals method compares array contents
        System.out.println("Are the two persons equal? " + result);
    }
}