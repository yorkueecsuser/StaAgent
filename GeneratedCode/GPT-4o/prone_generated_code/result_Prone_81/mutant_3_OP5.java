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

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Case 1: This should never be reached.");
                break;
            case 2:
                System.out.println("Case 2: This should never be reached.");
                break;
            default:
                // Default case is also unreachable
                System.out.println("Default case: This should never be reached.");
                break;
        }
    }

    private int getUnreachableValue() {
        // Condition always returns a value that won't match any case in the switch statement
        return 0;
    }

    public static void main(String[] args) {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        example.showBug();
    }
}