import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        // Original assignment
        Optional<String> optional = Optional.of(input);

        // Duplicated assignment inserted after the original one
        Optional<String> optionalDuplicate = Optional.of(input);

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }
    }
}