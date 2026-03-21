class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int bfjnznde = 0;switch  (bfjnznde) {case 1:double uuifkvto = -579378369;break;default:float vxbitfzy = 209750970;break;}
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}