class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for  (int bygmmbwe = 0; bygmmbwe < 0; bygmmbwe++) {char bxipobjs = 'i';}
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}