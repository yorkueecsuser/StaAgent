import java.util.Optional;

class OptionalBug {
    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        bug.showBug();
    }

    public void showBug() {
        Optional<String> optional = Optional.ofNullable(null);  // BUG: "null" should not be used with "Optional"
        System.out.println(optional.orElse("Default Value"));  // This will print "Default Value"

        // Mutant code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This is an unreachable for loop. It should not be executed.
            // This loop must not be empty to avoid unreachable statement error.
            // This loop must iterate at least once to avoid unreachable statement error.
        }
    }

    private boolean getCondition() {
        return false;
    }
}