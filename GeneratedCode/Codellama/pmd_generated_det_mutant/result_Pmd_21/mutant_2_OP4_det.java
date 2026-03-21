class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && false && false && false && true && false && true && false && false && true && false) {boolean gvtojhao = false;}else{byte nfvnurfn = -45;}
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}