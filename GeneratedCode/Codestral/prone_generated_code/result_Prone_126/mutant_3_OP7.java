import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        // Inserted unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }

        if(optional.isPresent()) { // BUG: OptionalOfRedundantMethod - This is unnecessary as Optional.of() always returns a non-empty Optional
            return optional.get();
        } else {
            return "Default Value";
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}