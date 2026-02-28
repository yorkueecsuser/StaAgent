import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            switch (opt1) {
                // unreachable switch block
            }
        }
        return opt1 == opt2;
    }

    private boolean falseMethod() {
        return false;
    }
}