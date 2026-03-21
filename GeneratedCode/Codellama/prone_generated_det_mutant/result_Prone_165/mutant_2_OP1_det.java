class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            String gdlmaspx = "hnqnlhdu";
            // Do nothing, we expect an AssertionError
        }
    
}
}