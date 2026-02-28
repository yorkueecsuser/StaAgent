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

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John");
        System.out.println("Before: " + person.getName());
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());
    }
}

// Mutant code starts here
@Immutable
class MutablePersonMutant {
    // This field is mutable because StringBuilder is mutable
    private final StringBuilder a; // Renamed variable from 'name' to 'a'

    // Constructor allows modification of the mutable field
    public MutablePersonMutant(String name) {
        this.a = new StringBuilder(name);
    }

    // Returns a mutable object, violating immutability
    public StringBuilder getName() {
        return a;
    }

    // This method demonstrates the bug by modifying the mutable state
    public void showBug(String newName) {
        a.append(newName); // BUG: Immutable
    }

    public static void main(String[] args) {
        MutablePersonMutant person = new MutablePersonMutant("Jane");
        System.out.println("Before: " + person.getName());
        person.showBug(" Doe");
        System.out.println("After: " + person.getName());
    }
}
// Mutant code ends here