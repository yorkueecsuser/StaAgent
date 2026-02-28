import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        while (getUnreachableCondition()) {
            // Mutated code: Unreachable while loop
            System.out.println("This code will never execute.");
        }

        return LocalDate.of(2022, 13, 32);
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}