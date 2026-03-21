class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
boolean oqtdjphk = false;while (oqtdjphk && true && false && false && false && true && false && true && true && false && false && false) {short bxdftpds = -4755;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}