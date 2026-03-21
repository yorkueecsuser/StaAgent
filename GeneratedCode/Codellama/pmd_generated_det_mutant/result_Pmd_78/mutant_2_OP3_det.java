class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && false && false && false && true && true && false && false && false && false && false) {boolean zcfjlaxx = true;}
        int x = 5;
        // BUG: UnconditionalIfStatement
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}