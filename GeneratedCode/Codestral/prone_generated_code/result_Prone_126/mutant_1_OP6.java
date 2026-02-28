import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        // Mutated code: Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop");
        }

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }
    }

    // Placeholder method to return a false condition
    private boolean getCondition() {
        return false;
    }
}