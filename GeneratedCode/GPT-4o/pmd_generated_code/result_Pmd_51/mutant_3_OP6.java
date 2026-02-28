class JumbledIncrementerExample {

    public void showBug() {
        for (int i = 0; i < 10; i++) {          // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            }
        }
        
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This loop is unreachable");
        }
    }

    public static boolean getCondition() {
        return false; // Condition is false, making the for loop unreachable
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}