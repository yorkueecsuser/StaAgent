class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        int value = getValue(); // Non-final variable used in switch statement
        switch (value) {
            case 1:
                System.out.println("Inside case 1");
                break;
            default:
                System.out.println("Inside default case");
                break;
        }
    }

    public static int getValue() {
        return 0; // Always return 0 to make the switch statement unreachable
    }
}