class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 5;
        // BUG: UnconditionalIfStatement
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            if (true && true && false && false && true && true && false && false && true && false && false) {byte acjglcue = 30;}
            System.out.println("x is less than or equal to 10");
        }
    
}
}