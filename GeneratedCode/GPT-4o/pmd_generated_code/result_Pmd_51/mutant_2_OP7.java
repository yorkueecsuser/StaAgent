class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        // Adding an unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
    }

    // Method to simulate a condition that returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}