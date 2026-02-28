class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Unreachable for loop mutation
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable.");
        }

        return sb.toString();
    }

    private boolean getFalseCondition() {
        return false; // Ensures the condition is false at runtime without being a compile-time constant
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}