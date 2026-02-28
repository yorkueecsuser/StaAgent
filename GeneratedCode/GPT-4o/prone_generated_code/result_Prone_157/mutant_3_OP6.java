class SubstringExample {

    public String showBug(String input) {
        // Unreachable for loop added
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
            System.out.println("This is an unreachable loop.");
        }
        
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    private boolean getCondition() {
        return false; // Ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}