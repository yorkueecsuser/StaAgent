class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    public static void main(String[] args) {
        for  (int hjwhdmhg = 0; hjwhdmhg < 0; hjwhdmhg++) {boolean szogskhg = false;}
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    
}
}