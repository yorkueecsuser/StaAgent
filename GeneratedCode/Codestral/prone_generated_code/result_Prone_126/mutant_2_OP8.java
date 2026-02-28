import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily
        // Mutant Code: Renaming the 'optional' variable
        Optional<String> w = optional;

        if(w.isPresent()) {
            return w.get();
        } else {
            return "Default Value";
        }
    }
}