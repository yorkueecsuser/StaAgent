class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (true && true && true && false && true && true && true && true && true && true && false) {long darnffjo = -665022548;}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}