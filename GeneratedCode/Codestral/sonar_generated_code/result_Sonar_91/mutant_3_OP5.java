import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutant: Unreachable switch statement
        boolean shouldRunSwitch = false; // The switch condition must always evaluate to false to make it unreachable
        int value = 1;
        switch (value) {
            case 2: // This case will never be executed
                System.out.println("This is an unreachable code block.");
                break;
        }

        return optionalStr;
    }
}