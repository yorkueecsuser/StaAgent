import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Mutant code: Unreachable switch statement
        boolean shouldRun = false;
        int valueSwitch = 0;
        if (shouldRun) {
            switch (valueSwitch) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return stringValue;
    }
}