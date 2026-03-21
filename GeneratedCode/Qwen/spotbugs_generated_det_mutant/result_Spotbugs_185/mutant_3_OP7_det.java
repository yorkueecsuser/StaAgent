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
boolean gndmrmlz = false;while (gndmrmlz && true && false && false && false && false && true && false && true && true && true && false) {byte xnztufas = 52;}

        return counter;
    
}

    public static void main(String[] args) {
        RefactorToFinalExample example = new RefactorToFinalExample();
        System.out.println("Counter value: " + example.showBug());
    }
}