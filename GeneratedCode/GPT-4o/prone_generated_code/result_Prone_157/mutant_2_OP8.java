class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    public String showBugMutant(String input) {
        // Calling substring(0) on the input string with a renamed variable
        String x = input.substring(0); // BUG: SubstringOfZero
        return x;
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
        
        // Mutant execution
        String mutantResult = example.showBugMutant(original);
        System.out.println("Original: " + original);
        System.out.println("Result from showBugMutant: " + mutantResult);
    }
}