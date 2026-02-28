class JumbledIncrementerExample {
    
    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        // Introduce an unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // Ensure this value never matches any case
        switch (unreachableValue) {
            case 9999: // This case is never met
                System.out.println("Unreachable code");
                break;
            default:
                // Default is also unreachable due to the logic in getUnreachableValue
                System.out.println("Default unreachable");
                break;
        }
    }

    // This method returns a value that ensures the switch is not executed
    private int getUnreachableValue() {
        return -1; // Using a value that does not match any case
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}