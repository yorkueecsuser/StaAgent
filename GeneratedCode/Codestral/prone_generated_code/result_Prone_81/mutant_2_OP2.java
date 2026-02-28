import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        LocalDate date = LocalDate.of(2022, 13, 32);
        // Mutant Code: Duplication
        LocalDate duplicateDate = date;
        return date;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}