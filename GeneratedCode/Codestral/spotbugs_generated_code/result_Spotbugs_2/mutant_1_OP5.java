import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        int condition = getCondition(); // assuming this method returns a dynamic value
        switch(condition) {
            case 0:
                // This should be unreachable as getCondition() never returns 0
                System.out.println("Unreachable code");
                break;
        }

        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    }

    public Optional<String> showBug() {
        return getOptionalString(true);
    }

    // assume this is a placeholder for a method that returns a dynamic value
    public int getCondition() {
        return (int)(Math.random() * 10);
    }
}