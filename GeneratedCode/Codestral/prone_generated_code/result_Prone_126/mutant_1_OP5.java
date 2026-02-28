import java.util.Optional;

class OptionalOfRedundantMethodBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input); // Bug: Using Optional.of() unnecessarily

        if(optional.isPresent()) { // BUG: OptionalOfRedundantMethod - This is unnecessary as Optional.of() always returns a non-empty Optional
            boolean shouldRun = getFalseCondition();
            switch (shouldRun) {
                case true:
                    System.out.println("This line is unreachable");
                    break;
                default:
                    break;
            }
            return optional.get();
        } else {
            return "Default Value";
        }
    }
}