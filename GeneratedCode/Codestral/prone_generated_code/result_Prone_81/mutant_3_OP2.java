import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        LocalDate buggyDate = LocalDate.of(2022, 13, 32);
        // Mutant: Duplication
        LocalDate duplicatedBuggyDate = LocalDate.of(2022, 13, 32);
        return buggyDate;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}