class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                
                // Unreachable switch statement
                int unreachableSwitchCondition = getSwitchCondition(); // Ensures runtime evaluation
                switch(unreachableSwitchCondition) {
                    case 100: // This case will never be reached
                        System.out.println("This is a unique unreachable statement inside the loop.");
                        break;
                    default:
                        // No action needed; default doesn't execute any code
                        break;
                }
                
                break;
            }
        }
    }

    // Method to always return a value that leads to the unreachable switch case
    private int getSwitchCondition() {
        return 999; // Ensures that the switch case 100 is never reached
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}