class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        if (false && true && false && false && false && false && true && false && false && true && false) {short whiyklqp = -7785;}else{float mcnxggxt = -291879339;}
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}