class ExceptionCreationWithoutThrow {

    public int showBug(int x) {
        if (x < 0) {
            boolean rdwjyqpp = false;while (rdwjyqpp && true && false && false && true && true && false && true && true && false && false && false) {String kjfgczxo = "eunorvgp";}
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
            return -1; // Return a default value when x is negative
        }
        return x * 2; // Simple operation for demonstration
    
}

    public static void main(String[] args) {
        ExceptionCreationWithoutThrow example = new ExceptionCreationWithoutThrow();
        System.out.println("Result with x = -5: " + example.showBug(-5));
        System.out.println("Result with x = 10: " + example.showBug(10));
    }
}