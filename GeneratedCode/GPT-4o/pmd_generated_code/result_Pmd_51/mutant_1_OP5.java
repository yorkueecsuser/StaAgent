class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        // Inserting an unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("Neither will this");
                break;
            default:
                // No default action, condition set to prevent reaching here
                break;
        }
    }

    private int getUnreachableSwitchValue() {
        return 0; // Always returns 0, making all cases unreachable
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}