import java.util.ArrayList;

// Assume that we have access to the Error Prone library's annotation.
// import com.google.errorprone.annotations.Immutable;

// Simulating the @Immutable annotation for demonstration purposes
@interface Immutable {}

// This class is incorrectly marked as @Immutable because it contains mutable fields
@Immutable
class MutablePerson {
    // This field is mutable because StringBuilder is mutable
    private final StringBuilder name; // BUG: Immutable

    // Constructor allows modification of the mutable field
    public MutablePerson(String name) {
        this.name = new StringBuilder(name);
    }

    // Returns a mutable object, violating immutability
    public StringBuilder getName() {
        return name;
    }

    // This method demonstrates the bug by modifying the mutable state
    public void showBug(String newName) {
        name.append(newName); // BUG: Immutable
    }

    // Mutated code starts here
    private final StringBuilder a; // Renamed variable

    public MutablePerson(String name, String initialName) {
        this.name = new StringBuilder(name);
        this.a = new StringBuilder(initialName);
    }

    public StringBuilder getA() {
        return a;
    }

    public void showBugInMutant(String newName) {
        a.append(newName); // Demonstrating mutation with renamed variable
    }

    public static void testMutant() {
        MutablePerson person = new MutablePerson("John", "Initial");
        System.out.println("Before mutation: " + person.getA());
        person.showBugInMutant(" Mutant");
        System.out.println("After mutation: " + person.getA());
    }
    // Mutated code ends here

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John");
        System.out.println("Before: " + person.getName());
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());

        // Testing mutated code
        testMutant();
    }
}