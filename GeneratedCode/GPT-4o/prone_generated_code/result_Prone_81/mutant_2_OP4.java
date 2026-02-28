import java.time.LocalDateTime;

class InvalidJavaTimeExample {

    public void showBug() {
        try {
            // Attempting to create a LocalDateTime with an invalid month (13)
            LocalDateTime invalidDateTime = LocalDateTime.of(2023, 13, 15, 10, 30); // BUG: InvalidJavaTimeConstant
            System.out.println(invalidDateTime);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

        try {
            // Attempting to create a LocalDateTime with an invalid day (32)
            LocalDateTime invalidDateTime = LocalDateTime.of(2023, 12, 32, 10, 30); // BUG: InvalidJavaTimeConstant
            System.out.println(invalidDateTime);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

        // Unreachable if-else statement mutation
        boolean isConditionMet = checkCondition();
        if (isConditionMet) {
            System.out.println("This code is executed conditionally.");
        } else {
            System.out.println("This is an unreachable else branch.");
        }
    }

    // Method to determine condition at runtime
    private boolean checkCondition() {
        return false; // This method will dynamically return false
    }

    public static void main(String[] args) {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        example.showBug();
    }
}