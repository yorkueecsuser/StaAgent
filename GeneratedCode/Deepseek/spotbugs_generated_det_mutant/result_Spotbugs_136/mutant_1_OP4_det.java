class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (false && false && false && true && true && true && false && true && false && true && false) {short utivczvm = -719;}else{short wpnddtlc = -3556;}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}