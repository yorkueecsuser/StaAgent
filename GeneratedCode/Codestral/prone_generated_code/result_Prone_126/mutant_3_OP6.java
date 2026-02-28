import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        boolean condition = false;
        for(int i = 0; condition; i++) { // Mutant: Unreachable for loop
            System.out.println("This code will never be executed");
        }

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }
    }

    private boolean getCondition() {
        return false;
    }
}