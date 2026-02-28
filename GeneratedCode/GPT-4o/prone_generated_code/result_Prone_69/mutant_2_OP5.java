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

    // Inserted unreachable switch statement
    public void unreachableSwitch() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never execute.");
                break;
            default:
                // Default case does nothing
                break;
        }
    }

    // Method to provide a value that never matches case 1
    private int getUnreachableValue() {
        return 0; // Ensures switch statement is unreachable
    }

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John");
        System.out.println("Before: " + person.getName());
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());

        // Call to the method with unreachable switch
        person.unreachableSwitch();
    }
}