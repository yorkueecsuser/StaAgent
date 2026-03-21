class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (true && false && true && true && false && false && true && true && false && true && false) {String zdyrlfxi = "mdrfbhzv";}else{char crajuwxy = 'f';}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}