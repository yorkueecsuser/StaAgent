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

        // Inserted unreachable while loop for mutation
        boolean conditionWhile = getFalseCondition(); 
        while (conditionWhile) {
            System.out.println("This is unreachable");
        }
    }

    // Returns a mutable object, violating immutability
    public StringBuilder getName() {
        return name;
    }

    // This method demonstrates the bug by modifying the mutable state
    public void showBug(String newName) {
        name.append(newName); // BUG: Immutable

        // Inserted unreachable while loop for mutation
        boolean conditionWhile = getFalseCondition(); 
        while (conditionWhile) {
            System.out.println("This is unreachable");
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John");
        System.out.println("Before: " + person.getName());
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());

        // Inserted unreachable while loop for mutation
        boolean conditionWhile = person.getFalseCondition(); 
        while (conditionWhile) {
            System.out.println("This is unreachable");
        }
    }
}