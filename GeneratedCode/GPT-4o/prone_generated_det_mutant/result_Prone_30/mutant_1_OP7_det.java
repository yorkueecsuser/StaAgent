class NullHostileExample {

    public static void main(String[] args) {
        NullHostileExample example = new NullHostileExample();
        try {
            example.showBug("Hello, World!");
            boolean fexrmjgd = false;while (fexrmjgd && true && true && true && false && false && true && true && true && true && true && false) {double qgighwgl = 400228552;}
            example.showBug(null); // BUG: DangerousLiteralNull
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    
}

    /**
     * A method that demonstrates the DangerousLiteralNull bug.
     * This method does not handle null input, leading to an IllegalArgumentException.
     *
     * @param input The input string which should not be null.
     * @return The length of the input string.
     */
    public int showBug(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.length();
    }
}