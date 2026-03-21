class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            if (false && false && false && false && false && true && true && true && false && true && false) {byte bzyshjdk = 123;}else{char qykrobre = 'p';}
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            // Do nothing, we expect an AssertionError
        }
    
}
}