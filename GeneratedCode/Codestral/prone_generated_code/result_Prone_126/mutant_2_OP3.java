import java.util.Optional;

class OptionalOfRedundantMethodBug {

    private boolean getUnreachableCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        if(optional.isPresent()) {
            return optional.get();
        } else {
            if (getUnreachableCondition()) { // Unreachable if statement
                return "Unreachable Value";
            }
            return "Default Value";
        }
    }
}