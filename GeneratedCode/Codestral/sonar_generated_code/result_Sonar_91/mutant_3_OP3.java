import java.util.Optional;

class OptionalNullBug {
    private boolean getUnreachableCondition() {
        // Simulate a dynamically determined condition that is always false
        return false;
    }

    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);

        // Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed.");
        }

        return optionalStr;
    }
}