import java.util.Optional;
import java.lang.Math;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        int deadStore; // Dead Store Mutant: Unused variable declaration
        deadStore = (int) (Math.random() * 100); // Assigning a random value to the dead store variable
        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }
}