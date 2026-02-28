import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);

        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This is an unreachable while loop as its condition is always false
            System.out.println("This line will never be executed.");
        }

        return optionalStr;
    }
}