import java.util.Optional;

class BugExample {
    Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    Optional<String> methodThatReturnsOptional() {
        return Optional.empty();
    }

    public void showBug() {
        Optional<String> value = this.getOptionalValue();
        if (value.isPresent()) {
            String stringValue = value.get();
        } else {
            boolean condition = false;
        }

        if (methodThatReturnsOptional().isPresent()) {
            String value2 = methodThatReturnsOptional().get();
        } else {
            boolean condition = false;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}