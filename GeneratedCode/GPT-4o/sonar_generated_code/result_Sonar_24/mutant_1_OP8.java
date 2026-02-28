import java.util.Arrays;

class RecordBugDemo {

    record Person(String[] names, int age) {} // BUG: Equals method should be overridden in records containing array fields

    public boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        return person1.equals(person2);
    }

    public static void main(String[] args) {
        RecordBugDemo demo = new RecordBugDemo();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will print 'false' because the default equals method compares array references
        System.out.println("Are the two persons equal? " + result);
    }
}

// Mutant Code - Applying Renaming Mutation Operator
class RecordBugDemoMutant {

    // Renaming Variables: Person class, names field, and age field renamed to x, y, z respectively
    record x(String[] y, int z) {
        // Overriding equals method to correctly compare array contents
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            x other = (x) obj;
            return z == other.z && Arrays.equals(y, other.y);
        }
    }

    public boolean showBugMutant(String[] y1, int z1, String[] y2, int z2) {
        x person1 = new x(y1, z1);
        x person2 = new x(y2, z2);

        return person1.equals(person2);
    }

    public static void main(String[] args) {
        RecordBugDemoMutant demo = new RecordBugDemoMutant();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBugMutant(names, 30, names.clone(), 30);
        
        // This will print 'true' because the equals method correctly compares array contents
        System.out.println("Are the two persons equal in mutant? " + result);
    }
}