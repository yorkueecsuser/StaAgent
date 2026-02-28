import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        if (getUnreachableCondition()) {
            // This block will never be executed
            throw new RuntimeException("Unreachable code executed");
        }
        return LocalDate.of(2022, 13, 32);
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}