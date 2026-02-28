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

    // Method to get a runtime boolean condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John");
        System.out.println("Before: " + person.getName());
        
        // Inserting unreachable if statement
        MutablePerson instance = new MutablePerson("Dummy");
        boolean condition = instance.getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement");
        }
        
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());
    }
}