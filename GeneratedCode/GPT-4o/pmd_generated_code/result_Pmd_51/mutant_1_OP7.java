class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }

        // Mutation Operator: Unreachable while loop
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This is an unreachable while loop");
        }
    }

    // Method to simulate a false condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}