class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code will never execute.");
        } else {
            System.out.println("This is the else branch.");
        }
    }

    // A method that always returns false to ensure the if branch is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}