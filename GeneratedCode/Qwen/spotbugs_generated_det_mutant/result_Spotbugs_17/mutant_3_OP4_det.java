class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    public static void main(String[] args) {
        if (false && true && true && false && true && true && true && false && true && true && false) {byte renehrop = -14;}else{boolean ilyzdhgv = true;}
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    
}
}