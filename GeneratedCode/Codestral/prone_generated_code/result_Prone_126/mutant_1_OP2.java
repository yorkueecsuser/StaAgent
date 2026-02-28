import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        // Mutant Code: Duplication of the assignment statement
        Optional<String> duplicateOptional = Optional.of(input);

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }
    }
}