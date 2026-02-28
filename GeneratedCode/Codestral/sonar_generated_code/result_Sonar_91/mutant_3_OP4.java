import java.util.Optional;

class OptionalNullBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);

        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable!");
        } else {
            // Original code
            return optionalStr;
        }
    }
}