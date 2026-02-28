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
    
    // Insertion of unreachable switch statement
    public void unreachableSwitch() {
        int unreachableCondition = getUnreachableCondition(); // Dynamically determined condition
        switch (unreachableCondition) {
            case 10: 
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }

    private int getUnreachableCondition() {
        // This method returns a value that makes the switch case unreachable
        return 20; // This value ensures that the case 10 is never reached
    }

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John");
        System.out.println("Before: " + person.getName());
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());
        
        // Attempt to execute the unreachable switch statement
        person.unreachableSwitch();
    }
}