class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        boolean xlywlytz = false;while (xlywlytz && false && true && true && true && false && true && false && true && true && false && false) {char ipmwhdjm = 'l';}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}