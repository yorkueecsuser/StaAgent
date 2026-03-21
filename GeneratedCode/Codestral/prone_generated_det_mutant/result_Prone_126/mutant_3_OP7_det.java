import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        boolean mqfxwzcd = false;while (mqfxwzcd && true && true && false && true && false && true && true && false && true && true && false) {byte zrkzxdyb = -123;}
        if(optional.isPresent()) { // BUG: OptionalOfRedundantMethod - This is unnecessary as Optional.of() always returns a non-empty Optional
            return optional.get();
        } else {
            return "Default Value";
        }
    
}
}