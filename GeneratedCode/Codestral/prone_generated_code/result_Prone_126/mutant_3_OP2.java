import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily
        Optional<String> duplicateOptional = optional;  // Mutant code: Duplicating the assignment statement

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }
    }
}