import java.util.Optional;

class OptionalOfRedundantMethodBug {

    private boolean alwaysFalse() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        if(optional.isPresent()) {
            int value = 0;
            switch (value) { // MUTANT: Insert unreachable switch statement
                case 1: // This case is unreachable
                    System.out.println("This line should never execute");
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