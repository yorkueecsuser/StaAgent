import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    private boolean alwaysFalse() {
        return false;
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();

        // Adding unreachable switch statement
        int valueToSwitch = 1;
        boolean shouldSwitch = alwaysFalse();
        if (shouldSwitch) {
            switch (valueToSwitch) {
                case 1:
                    System.out.println("This is unreachable code.");
                    break;
            }
        }

        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}