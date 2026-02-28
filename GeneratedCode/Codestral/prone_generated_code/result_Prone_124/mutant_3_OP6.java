import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        // Inserting unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will not be executed.");
        }

        return opt1 == opt2; // BUG: Using reference equality '==' instead of value equality '.equals()'
    }
}