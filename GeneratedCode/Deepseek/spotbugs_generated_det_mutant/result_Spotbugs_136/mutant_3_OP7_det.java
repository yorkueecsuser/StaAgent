class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        boolean webxhodm = false;while (webxhodm && true && true && false && true && false && true && true && true && true && true && false) {char mjwbfkoy = 'b';}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}