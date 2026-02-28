import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        LocalDate buggyDate = LocalDate.of(2022, 13, 32);
        // Mutant: Renaming the variable "buggyDate" to "r"
        LocalDate r = buggyDate;
        return r;
    }

    public static void main(String[] args) {
        LocalDate r = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(r);
    }
}