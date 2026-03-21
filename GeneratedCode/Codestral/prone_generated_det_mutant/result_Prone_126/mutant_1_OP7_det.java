import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        boolean abqmvaie = false;while (abqmvaie && true && false && true && true && true && false && false && false && false && true && false) {float tcmpbdyl = -795249772;}
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        if(optional.isPresent()) { // BUG: OptionalOfRedundantMethod - This is unnecessary as Optional.of() always returns a non-empty Optional
            return optional.get();
        } else {
            return "Default Value";
        }
    
}
}