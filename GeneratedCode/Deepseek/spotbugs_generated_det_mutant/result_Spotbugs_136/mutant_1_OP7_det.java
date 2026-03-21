class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        boolean rszfqacy = false;while (rszfqacy && false && true && true && false && false && false && true && true && true && true && false) {double eiygqqfw = 321884890;}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}