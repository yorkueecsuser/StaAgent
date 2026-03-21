class TryFailThrowable {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 0;
            int z = x / y;
            fail("Division by zero should fail!"); // BUG: TryFailThrowable
        } catch (Throwable t) {
            int yfbweryq = 0;switch  (yfbweryq) {case 1:char fgqawdki = 'a';break;default:long xadtcjsj = 174753582;break;}
            // Do nothing, we expect an AssertionError
        }
    
}
}