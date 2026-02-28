import java.util.Arrays;

class RecordBugDemo {

    record Person(String[] names, int age) {
        // Overriding equals to handle array fields
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

        // Unreachable if-else statement with a dynamically determined condition
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable due to condition being false.");
        } else {
            System.out.println("This is an unreachable else branch.");
        }

        return person1.equals(person2);
    }

    // Method to simulate a condition for the unreachable if-else statement
    private boolean getCondition() {
        // Always returns false, making the if statement's block unreachable
        return false;
    }

    public static void main(String[] args) {
        RecordBugDemo demo = new RecordBugDemo();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will print 'true' because the equals method is overridden
        System.out.println("Are the two persons equal? " + result);
    }
}