import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        if(optional.isPresent()) {
            return optional.get();
        } else {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This block is unreachable
                System.out.println("This is an unreachable block");
            }
            return "Default Value";
        }
    }

    public boolean getUnreachableCondition() {
        return false;
    }
}