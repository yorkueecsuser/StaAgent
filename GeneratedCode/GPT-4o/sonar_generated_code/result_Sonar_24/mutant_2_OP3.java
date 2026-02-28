import java.util.Arrays;

class RecordBugDemo {

    record Person(String[] names, int age) {
        // Override equals method to handle array fields correctly
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Person person = (Person) obj;
            return age == person.age && Arrays.equals(names, person.names);
        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(names);
            result = 31 * result + Integer.hashCode(age);
            return result;
        }
    }

    public boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        // Insert an unreachable if statement with a dynamically determined condition
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            System.out.println("This will never print.");
        }

        return person1.equals(person2);
    }

    // Method to return a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RecordBugDemo demo = new RecordBugDemo();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will print 'true' because the equals method now compares array contents
        System.out.println("Are the two persons equal? " + result);
    }
}