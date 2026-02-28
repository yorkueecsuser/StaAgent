class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation

        // Introduce an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Use a method to ensure runtime determination
        switch (unreachableValue) {
            case 9999: // This case will never be reached as unreachableValue is not 9999
                System.out.println("This is unreachable code.");
                break;
            default:
                break;
        }
    }

    private int getUnreachableValue() {
        // This method returns a value different from 9999 to ensure the switch case is never reached
        return -1;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}