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

// Mutation: Renaming of a user-defined variable
// Original variable: person1
// New variable name: a
class RecordBugDemoMutant {

    record Person(String[] names, int age) {} // BUG: Equals method should be overridden in records containing array fields

    public boolean showBug(String[] names1, int age1, String[] names2, int age2) {
        Person a = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        return a.equals(person2);
    }

    public static void main(String[] args) {
        RecordBugDemoMutant demo = new RecordBugDemoMutant();
        
        // Create two different objects with the same data
        String[] names = {"Alice", "Bob"};
        boolean result = demo.showBug(names, 30, names.clone(), 30);
        
        // This will print 'false' because the default equals method compares array references
        System.out.println("Are the two persons equal? " + result);
    }
}