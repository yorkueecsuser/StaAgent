import java.util.Arrays;

class RecordBugDemo {

    record Person(String[] names, int age) {
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && Arrays.equals(names, person.names);
        }
    } // BUG: Equals method should be overridden in records containing array fields

    public boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        boolean condition = getCondition(); // Non-final variable used for unreachable if-else
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("Unreachable else branch executed.");
        }

        return person1.equals(person2);
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RecordBugDemo demo = new RecordBugDemo();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will print 'true' because equals method now compares array contents
        System.out.println("Are the two persons equal? " + result);
    }
}