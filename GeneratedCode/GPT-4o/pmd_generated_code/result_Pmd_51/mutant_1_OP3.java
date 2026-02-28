class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        // Introducing an unreachable if statement
        boolean condition = getFalseCondition(); // Use a method to ensure dynamic evaluation
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to ensure runtime evaluation of the false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}