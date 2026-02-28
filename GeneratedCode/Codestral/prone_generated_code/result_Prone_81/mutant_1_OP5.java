import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // Original code
        LocalDate date = LocalDate.of(2022, 13, 32);

        // Mutant code: Unreachable switch statement
        int unreachableValue = 10;
        switch (unreachableValue) {
            case 1:
            case 2:
            case 3:
                // This code is unreachable
                System.out.println("Unreachable code executed!");
                break;
            default:
                // This is the only reachable code
                break;
        }

        return date;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}