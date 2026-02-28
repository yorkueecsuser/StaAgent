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

        // Introducing unreachable if-else branch with a dynamically determined false condition
        boolean condition = getCondition(); // This method will always return false
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the always executed block.");
        }
    }

    // Method that always returns false, making the if condition unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        example.showBug();
    }
}