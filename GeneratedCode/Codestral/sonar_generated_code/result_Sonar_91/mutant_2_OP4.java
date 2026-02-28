import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);

        // Mutant code added here
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code will never be executed");
        } else {
            // Alternative code here
            System.out.println("This is the alternative code");
        }

        return optionalStr;
    }

    // Method to simulate a dynamically determined unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}