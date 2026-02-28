import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This line should never be executed.");
        }
        return LocalDate.of(2022, 13, 32);
    }

    private boolean getCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}