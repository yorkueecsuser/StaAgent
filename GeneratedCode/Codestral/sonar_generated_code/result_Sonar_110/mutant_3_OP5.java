class NullPointerDereference {
    private String message;

    public void showBug() {
        System.out.println(message.length());
        int value = getValue();
        switch (value) { // Mutant: Unreachable switch statement
            case 0:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }

    private int getValue() {
        return -1; // This ensures the switch statement is unreachable
    }
}