import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        // Mutant: Unreachable if statement
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            // This branch is unreachable due to the condition being always false
            System.out.println("This line should never be executed");
        }

        return LocalDate.of(2022, 13, 32);
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}