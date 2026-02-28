import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        if (getCondition()) {
            // Unreachable if statement
            System.out.println("This line will never be printed");
        }
        return LocalDate.of(2022, 13, 32);
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}