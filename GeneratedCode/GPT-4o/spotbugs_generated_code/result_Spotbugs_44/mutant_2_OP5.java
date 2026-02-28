class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)

        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This code is unreachable because unreachableSwitchValue is not 1.");
                break;
            case 2:
                System.out.println("This code is also unreachable because unreachableSwitchValue is not 2.");
                break;
            default:
                // Do nothing, ensuring the switch statement is syntactically correct
                break;
        }
    }

    private int getUnreachableSwitchValue() {
        return 0; // Always returns 0, making other cases unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}