import java.util.Optional;

class OptionalOfRedundantMethodBug {

    // This method will always return false to ensure the if-else branch is unreachable
    private boolean alwaysFalse() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }

        // Inserted unreachable if-else branch
        if (alwaysFalse()) {
            return "Unreachable Value";
        } else {
            // This branch will never be executed, but it's necessary to avoid compilation errors
            return "This branch is unreachable";
        }
    }
}