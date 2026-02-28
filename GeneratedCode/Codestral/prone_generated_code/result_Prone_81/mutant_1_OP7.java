import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable, as the condition is always false
        }
        // BUG: InvalidJavaTimeConstant
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