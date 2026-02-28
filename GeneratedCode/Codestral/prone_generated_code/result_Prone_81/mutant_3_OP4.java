import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // Original code
        LocalDate date = LocalDate.of(2022, 13, 32);

        // Mutated code with Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code executed");
        } else {
            // This block is unreachable
            // For demonstration purposes, let's print a message
            System.out.println("This is unreachable code");
        }

        return date;
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}