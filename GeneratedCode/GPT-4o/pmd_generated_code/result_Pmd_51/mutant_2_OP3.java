class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                
                // Inserting unreachable if branch
                boolean condition = getAlwaysFalseCondition();
                if (condition) {
                    System.out.println("This is an unreachable branch");
                }
                
                break;
            }
        }
    }

    // Method that always returns false to ensure the if branch is unreachable
    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}