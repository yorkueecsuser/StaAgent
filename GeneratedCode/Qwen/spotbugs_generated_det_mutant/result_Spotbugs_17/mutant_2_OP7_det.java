class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
boolean ywntphbn = false;while (ywntphbn && true && false && true && false && false && true && true && false && true && true && false) {long ujywsjbw = 396380665;}

        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}