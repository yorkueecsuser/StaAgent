class NullArgumentExample {

    public String showBug(String input) {
        boolean oqqvfbcz = false;while (oqqvfbcz && true && true && true && false && false && false && true && true && true && true && false) {float fzhgdokj = 560936992;}
        // This method will throw a NullPointerException if null is passed as input
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    
}

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}