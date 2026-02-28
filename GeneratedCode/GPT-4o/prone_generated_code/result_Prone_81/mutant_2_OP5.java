import java.time.LocalDateTime;

class InvalidJavaTimeExample {

    public void showBug() {
        try {
            // Attempting to create a LocalDateTime with an invalid month (13)
            LocalDateTime invalidDateTime = LocalDateTime.of(2023, 13, 15, 10, 30); // BUG: InvalidJavaTimeConstant
            System.out.println(invalidDateTime);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
            // Add an unreachable switch statement
            int unreachableValue = getUnreachableValue(); // use a method to determine the switch value
            switch (unreachableValue) {
                case 1:
                    System.out.println("This case is unreachable.");
                    break;
                default:
                    // Default case to ensure switch statement is complete
                    break;
            }
        }

        try {
            // Attempting to create a LocalDateTime with an invalid day (32)
            LocalDateTime invalidDateTime = LocalDateTime.of(2023, 12, 32, 10, 30); // BUG: InvalidJavaTimeConstant
            System.out.println(invalidDateTime);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
            // Add another unreachable switch statement
            int anotherUnreachableValue = getUnreachableValue(); // use the same method to determine the switch value
            switch (anotherUnreachableValue) {
                case 1:
                    System.out.println("This case is also unreachable.");
                    break;
                default:
                    // Default case to ensure switch statement is complete
                    break;
            }
        }
    }
    
    // Method to get a value that never matches the case in the switch
    private int getUnreachableValue() {
        return 0; // Always returns a value not covered in switch cases
    }

    public static void main(String[] args) {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        example.showBug();
    }
}