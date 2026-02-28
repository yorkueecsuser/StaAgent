import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> optional = Optional.of(input);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            return "Default Value";
        }

        // Mutated code
        boolean isUnreachable = false;
        if (isUnreachable) {
            // This code will never execute
            System.out.println("This is an unreachable branch.");
        } else {
            // This else branch is also unreachable
            System.out.println("This else branch is also unreachable.");
        }
    }
}