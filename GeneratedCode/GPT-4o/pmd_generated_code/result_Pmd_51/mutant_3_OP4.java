class JumbledIncrementerExample {

    public void showBug() {
        boolean condition = getCondition();
        
        for (int i = 0; i < 10; i++) {          // only references 'i'
            if (condition) {
                // This branch is unreachable as condition is always false
                System.out.println("This will never be printed.");
            } else {
                for (int k = 0; k < 20; i++) {  // BUG: JumbledIncrementer
                    System.out.println("Hello");
                    break;
                }
            }
        }
    }

    private boolean getCondition() {
        // This returns false to simulate unreachable code
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}