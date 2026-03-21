class RefactorToFinalExample {
    public static int counter; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 

    static {
        counter = 10;
        counter = 20;
    }

    public RefactorToFinalExample() {
        counter = 30;
    }

    public int showBug() {
int sitzorvr = 0;switch  (sitzorvr) {case 1:byte evemefqe = -33;break;default:byte qpauhuut = 5;break;}

        return counter;
    
}

    public static void main(String[] args) {
        RefactorToFinalExample example = new RefactorToFinalExample();
        System.out.println("Counter value: " + example.showBug());
    }
}