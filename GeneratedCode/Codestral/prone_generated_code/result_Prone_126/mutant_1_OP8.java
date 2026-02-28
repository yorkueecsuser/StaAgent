import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> opt = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        if(opt.isPresent()) { // BUG: OptionalOfRedundantMethod - This is unnecessary as Optional.of() always returns a non-empty Optional
            return opt.get();
        } else {
            return "Default Value";
        }
    }
}