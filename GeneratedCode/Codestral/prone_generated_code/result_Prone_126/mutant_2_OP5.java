import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public boolean getFalseValue() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        if(optional.isPresent()) {
            // Adding the unreachable switch statement
            boolean falseValue = getFalseValue();
            switch (falseValue) {
                case 1:
                    System.out.println("Unreachable code");
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