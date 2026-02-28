import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable branch
            System.out.println("This branch is unreachable");
        } else {
            // Original code
            return LocalDate.of(2022, 13, 32);
        }
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}