import java.util.Optional;

class OptionalOfRedundantMethodBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        if(optional.isPresent()) { // BUG: OptionalOfRedundantMethod - This is unnecessary as Optional.of() always returns a non-empty Optional
            return optional.get();
        } else {
            return "Default Value";
        }

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code will never execute.");
        } else {
            // This else block is also unreachable
            System.out.println("This code will also never execute.");
        }
    }
}