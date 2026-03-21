class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean fwsincwe = false;while (fwsincwe && true && true && true && true && false && false && true && false && false && true && false) {float xknwzouv = -731098218;}
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}