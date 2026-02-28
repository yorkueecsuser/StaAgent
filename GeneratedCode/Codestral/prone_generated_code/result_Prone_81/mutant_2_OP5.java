import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        LocalDate date = LocalDate.of(2022, 13, 32);

        // Mutant: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable code executed");
                    break;
            }
        }

        return date;
    }

    private boolean getCondition() {
        // This method always returns false to ensure the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}