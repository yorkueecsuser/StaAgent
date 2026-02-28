class SubstringExample {

    public String showBug(String input) {
        // Adding an unreachable for loop
        boolean conditionFor = getCondition(); // Non-final condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print");
        }

        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    private boolean getCondition() {
        // Dynamic condition that always returns false
        return false;
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}