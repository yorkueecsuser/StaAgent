class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        boolean conditionFor = getFalseCondition(); // Using a method to provide the loop condition
        for (int j = 0; conditionFor; j++) { // Unreachable for loop due to false condition
            System.out.println("This is unreachable code.");
        }
    }

    private boolean getFalseCondition() {
        return false; // The condition method returns false, ensuring the loop is unreachable
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}