import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        LocalDate date = LocalDate.of(2022, 13, 32);

        // Mutant: Unreachable if-else statement
        if (isConditionFalse()) {
            throw new IllegalStateException("Unreachable code executed");
        } else {
            // This else block is intentionally left empty to simulate an unreachable branch
        }

        return date;
    }

    private boolean isConditionFalse() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}