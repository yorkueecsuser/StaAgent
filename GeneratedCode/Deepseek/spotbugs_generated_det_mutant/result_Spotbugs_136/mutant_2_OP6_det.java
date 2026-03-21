class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        for  (int uulmaqwi = 0; uulmaqwi < 0; uulmaqwi++) {String priyeyfh = "rzhdjwfu";}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}