import java.util.Arrays;

class RecordBugDemo {

    record Person(String[] names, int age) {
        // Override equals method to handle arrays properly
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && Arrays.equals(names, person.names);
        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(names);
            result = 31 * result + age;
            return result;
        }
    } // BUG: Equals method should be overridden in records containing array fields

    public boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        // Insert unreachable switch statement
        int unreachableCase = getUnreachableValue(); // Using a method to ensure it's not a compile-time constant
        switch (unreachableCase) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Default case does nothing
        }

        return person1.equals(person2);
    }

    private int getUnreachableValue() {
        return 0; // Always returning a value that doesn't match any case above
    }

    public static void main(String[] args) {
        RecordBugDemo demo = new RecordBugDemo();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will print 'true' because the overridden equals method compares array contents
        System.out.println("Are the two persons equal? " + result);
    }
}