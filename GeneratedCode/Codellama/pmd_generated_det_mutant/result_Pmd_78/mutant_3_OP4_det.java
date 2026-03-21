class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 5;
        // BUG: UnconditionalIfStatement
        if (x > 10) {
            if (false && true && true && false && true && true && true && true && false && false && false) {short conlguaq = 6935;}else{int dtbynwre = -423840722;}
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}