import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        boolean unreachableCondition = isUnreachable();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }
    }

    private boolean isUnreachable() {
        return false;
    }
}