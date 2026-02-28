import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        int value = 0; // Constant that always evaluates to false
        switch (value) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        // Original code
        return LocalDate.of(2022, 13, 32);
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}