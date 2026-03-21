class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (true && false && true && false && false && true && true && false && false && true && false) {char txiwrayn = 'a';}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}