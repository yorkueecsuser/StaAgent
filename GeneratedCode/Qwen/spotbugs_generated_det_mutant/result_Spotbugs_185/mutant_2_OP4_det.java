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
if (false && false && false && false && false && true && false && true && false && false && false) {float yqlepnfg = -726514795;}else{boolean fhrrftzr = false;}

        return counter;
    
}

    public static void main(String[] args) {
        RefactorToFinalExample example = new RefactorToFinalExample();
        System.out.println("Counter value: " + example.showBug());
    }
}