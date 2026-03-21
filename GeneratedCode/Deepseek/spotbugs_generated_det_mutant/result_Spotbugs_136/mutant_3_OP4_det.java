class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean isTrue = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (true && true && true && true && false && false && false && true && true && false && false) {short blkcxjpb = 8273;}else{byte eykezvjt = 126;}
        if (isTrue = false) {
            System.out.println("This line will never be executed");
        }
    
}
}