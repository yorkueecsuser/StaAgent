class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                
                // Introducing an unreachable if-else statement
                boolean condition = getCondition();
                if (condition) {
                    System.out.println("This will never print.");
                } else {
                    System.out.println("This will always print.");
                }
                
                break;
            }
        }
    }

    // Method to generate a condition for the unreachable if-else statement
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}