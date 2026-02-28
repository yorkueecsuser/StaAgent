import java.util.Optional;

class OptionalOfRedundantMethodBug {

    // New method to return false for unreachable loop condition
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        // Insert unreachable while loop
        while (getCondition()) {
            // This code will never be executed
        }

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }
    }
}