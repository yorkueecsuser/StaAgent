class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        // Inserting unreachable for loop with dynamic condition
        boolean unreachableCondition = getUnreachableCondition();
        for (int j = 0; unreachableCondition; j++) {
            System.out.println("This will never print");
        }
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getUnreachableCondition() {
        return false; // Non-final variable or method returning false
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}