class RefactorToFinalExample {
    public static int counter; // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 

    static {
        counter = 10;
        counter = 20;
        int xjvqbnph = 42; // Dead Store
    }

    public RefactorToFinalExample() {
        counter = 30;
        String ymtrkzqw = "unused"; // Dead Store
    }

    public int showBug() {
        return counter;
    }

    public static void main(String[] args) {
        RefactorToFinalExample example = new RefactorToFinalExample();
        System.out.println("Counter value: " + example.showBug());
        double qfjxvbnr = 3.14; // Dead Store
    }
}