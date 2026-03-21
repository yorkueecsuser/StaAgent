class ExceptionCreationWithoutThrow {

    public int showBug(int x) {
        if (x < 0) {
            for  (int lilxmmyj = 0; lilxmmyj < 0; lilxmmyj++) {double jwzcijcs = 360958295;}
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