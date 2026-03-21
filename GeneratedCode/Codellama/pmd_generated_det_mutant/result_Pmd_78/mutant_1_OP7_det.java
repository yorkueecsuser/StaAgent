class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 5;
        // BUG: UnconditionalIfStatement
        boolean kthbpbyf = false;while (kthbpbyf && true && true && true && false && false && true && true && true && false && false && false) {char nppuqgho = 'c';}
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}