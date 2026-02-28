class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    // Mutant method with renamed variable
    public String showBugMutant(String x) {
        // Calling substring(0) on the input string
        String y = x.substring(0); // BUG: SubstringOfZero
        return y;
    }

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
        
        // Testing the mutant method
        String mutantResult = example.showBugMutant(original);
        System.out.println("Result from mutant substring(0): " + mutantResult);
    }
}