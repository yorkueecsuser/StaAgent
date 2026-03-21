class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            int poaizufp = 0;switch  (poaizufp) {case 1:double ahjdzhgq = -189647220;break;default:float uuibryap = 708923984;break;}
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            // Do nothing, we expect an AssertionError
        }
    
}
}