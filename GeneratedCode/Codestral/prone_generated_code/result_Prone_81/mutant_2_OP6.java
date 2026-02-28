import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop mutation
            System.out.println("Unreachable code");
        }
        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}