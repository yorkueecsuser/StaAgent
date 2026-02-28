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
    }

    // Mutant added code - renamed variable
    public void showBugMutant() {
        try {
            // Attempting to create a LocalDateTime with an invalid month (13)
            LocalDateTime a = LocalDateTime.of(2023, 13, 15, 10, 30); // BUG: InvalidJavaTimeConstant
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

        try {
            // Attempting to create a LocalDateTime with an invalid day (32)
            LocalDateTime a = LocalDateTime.of(2023, 12, 32, 10, 30); // BUG: InvalidJavaTimeConstant
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public static void main(String[] args) {
        InvalidJavaTimeExample example = new InvalidJavaTimeExample();
        example.showBug();
        example.showBugMutant(); // Call to the mutant method
    }
}