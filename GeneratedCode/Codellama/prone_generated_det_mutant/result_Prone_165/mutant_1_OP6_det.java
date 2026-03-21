class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            for  (int wrsemdsb = 0; wrsemdsb < 0; wrsemdsb++) {char evqbfwde = 'u';}
            int y = 0;
            int z = x / y;
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            // Do nothing, we expect an AssertionError
        }
    
}
}