class SubstringExample {

    public String showBug(String input) {
        // Inserting a dead store with a randomly generated variable name
        int abcdefgh = 42; // Dead Store: unused integer variable

        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}