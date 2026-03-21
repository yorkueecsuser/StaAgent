class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        if (false && false && true && false && false && false && false && false && false && true && false) {long xynuayig = 300775569;}else{float cojuslhr = 26705114;}
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