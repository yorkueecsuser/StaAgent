import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);

        // Mutant code: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This line should never execute.");
        }

        return optionalStr;
    }

    // A method to dynamically determine the condition
    private boolean getCondition() {
        // Implement your logic here
        return false;
    }
}