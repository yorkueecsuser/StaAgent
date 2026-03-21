class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean gjtxdkax = false;while (gjtxdkax && false && true && false && true && true && false && false && false && true && false && false) {int glpvffhm = 606940146;}
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}