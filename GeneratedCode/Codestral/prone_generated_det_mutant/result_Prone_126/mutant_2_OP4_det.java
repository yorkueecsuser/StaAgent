import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        if (true && false && false && true && true && true && false && true && false && true && false) {byte wtrucpgr = 57;}else{short jybuahps = 3709;}
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        if(optional.isPresent()) { // BUG: OptionalOfRedundantMethod - This is unnecessary as Optional.of() always returns a non-empty Optional
            return optional.get();
        } else {
            return "Default Value";
        }
    
}
}