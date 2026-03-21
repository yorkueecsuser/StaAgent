class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            for  (int wvrjrrpj = 0; wvrjrrpj < 0; wvrjrrpj++) {byte vuhnytat = 27;}
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            // Do nothing, we expect an AssertionError
        }
    
}
}