import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        boolean condition = getCondition(); // Added dynamic condition
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop is unreachable as the condition is always false
        }
        return LocalDate.of(2022, 13, 32);
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}