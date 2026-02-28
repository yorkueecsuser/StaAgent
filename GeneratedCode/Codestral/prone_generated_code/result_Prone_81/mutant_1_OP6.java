import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        // Added unreachable for loop mutant
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never execute");
        }

        return LocalDate.of(2022, 13, 32);
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}