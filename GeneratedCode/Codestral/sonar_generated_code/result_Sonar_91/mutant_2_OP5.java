import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);

        // Mutant code: Unreachable switch statement
        final int value = -1;
        switch (value) {
            case 1:
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case to avoid compiler errors
                break;
        }

        return optionalStr;
    }
}