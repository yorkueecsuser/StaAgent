class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Unreachable for loop mutant
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This will never be printed.");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
    
    // Helper method to ensure the for loop is unreachable
    private boolean getConditionFor() {
        return false;
    }
}