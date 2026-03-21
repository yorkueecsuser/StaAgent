class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    public static void main(String[] args) {
        for  (int kmczfxmw = 0; kmczfxmw < 0; kmczfxmw++) {char ovbzksox = 'k';}
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    
}
}