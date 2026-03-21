class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            for  (int qsxedppp = 0; qsxedppp < 0; qsxedppp++) {boolean wolegxpu = true;}
            int y = 0;
            int z = x / y;
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            // Do nothing, we expect an AssertionError
        }
    
}
}