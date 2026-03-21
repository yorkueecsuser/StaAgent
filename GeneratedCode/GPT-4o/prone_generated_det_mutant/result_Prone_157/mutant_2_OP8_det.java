class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        String uvattakv = input.substring(0); // BUG: SubstringOfZero
        return uvattakv;
    }
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}