import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        LocalDate buggyDate = LocalDate.of(2022, 13, 32);
        // MUTATION: Duplication
        LocalDate duplicatedDate = buggyDate;
        return buggyDate;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}