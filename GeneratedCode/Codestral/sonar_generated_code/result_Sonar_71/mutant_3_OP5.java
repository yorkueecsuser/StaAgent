import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        int unreachableValue = 1;
        boolean condition = getFalseCondition();
        if (condition) {
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is an unreachable switch statement.");
                    break;
            }
        }

        return stringValue;
    }
}