class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    }
    
    public String showBugMutant(String b) {
        // Calling substring(0) on the input string
        String y = b.substring(0); // BUG: SubstringOfZero
        return y;
    }

    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);

        // Calling the mutant version
        String resultMutant = example.showBugMutant(original);
        System.out.println("Result from showBugMutant: " + resultMutant);
    }
}