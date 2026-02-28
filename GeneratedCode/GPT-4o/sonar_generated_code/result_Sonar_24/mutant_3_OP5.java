import java.util.Arrays;

class RecordBugDemo {

    record Person(String[] names, int age) { 
        // Overriding equals to properly compare array fields
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Arrays.equals(names, person.names);
        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(names);
            result = 31 * result + age;
            return result;
        }
    }

    public boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        // Unreachable switch statement insertion
        int unreachableValue = calculateUnreachableValue();
        switch (unreachableValue) {
            case -1:
                System.out.println("This block is unreachable");
                break;
            default:
                break;
        }

        return person1.equals(person2);
    }

    private int calculateUnreachableValue() {
        // This method simulates a calculation that always results in a value not in the switch cases
        return -2;
    }

    public static void main(String[] args) {
        RecordBugDemo demo = new RecordBugDemo();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will now print 'true' because the equals method is properly overridden
        System.out.println("Are the two persons equal? " + result);
    }
}