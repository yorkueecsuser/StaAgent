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

    // Inserting a dead store according to the mutation operator
    public void deadStoreExample() {
        int abcdzxyz = 42; // Dead store: the variable is declared but never used
    }

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

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John");
        person.deadStoreExample(); // Call the method to ensure the dead store is recognized by the compiler
        System.out.println("Before: " + person.getName());
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());
    }
}