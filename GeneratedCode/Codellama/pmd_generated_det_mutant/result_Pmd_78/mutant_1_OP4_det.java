class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 5;
        // BUG: UnconditionalIfStatement
        if (x > 10) {
            if (false && true && false && true && false && false && true && true && false && true && false) {String tueeqjvw = "oqlxydnn";}else{float ccmatfmy = -361635346;}
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}