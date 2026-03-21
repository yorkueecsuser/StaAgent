class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        if (false && true && true && false && true && false && false && true && false && true && false) {boolean hbexerfr = true;}else{short rmmekwbv = 2080;}
        } catch (Throwable t) {
            // Do nothing, we expect an AssertionError
        }
    
}
}