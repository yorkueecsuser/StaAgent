class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
            
            // Adding an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("This is unreachable");
            }
        }
    }

    // Method to simulate a condition for the unreachable while loop
    private boolean getCondition() {
        return false;  // This makes the loop condition always false
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}