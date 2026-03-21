class TryFailThrowable {
    public static void main(String[] args) {
        long ykjspcoa = -735415718;
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            // Do nothing, we expect an AssertionError
        }
    
}
}