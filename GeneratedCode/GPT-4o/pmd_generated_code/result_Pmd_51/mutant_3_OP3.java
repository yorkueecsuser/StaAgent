class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                
                // Adding an unreachable if branch
                boolean unreachableCondition = getUnreachableCondition();
                if (unreachableCondition) {
                    System.out.println("This will never be printed.");
                }

                break;
            }
        }
    }

    // Method to simulate a condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}