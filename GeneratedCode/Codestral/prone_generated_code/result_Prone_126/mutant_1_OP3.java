import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }

        // Mutant: Unreachable if statement
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            return "Unreachable Code";
        }
    }

    // This method is added to ensure dynamic determination of the unreachable condition
    private boolean falseMethod() {
        return false;
    }
}