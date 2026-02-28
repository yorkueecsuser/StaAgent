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

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed");
        }
    }

    // Method to return a condition for the for loop, ensuring it's always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        example.showBug();
    }
}