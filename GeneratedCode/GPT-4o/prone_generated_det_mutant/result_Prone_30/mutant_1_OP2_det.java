class NullHostileExample {
public static void main(String [] args){
    NullHostileExample example = new NullHostileExample();
    example = new NullHostileExample();
    try { example.showBug("Hello, World!"); example.showBug(null); } catch(IllegalArgumentException e){ System.out.println(e.getMessage()); }
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