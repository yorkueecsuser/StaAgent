class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 5;
        // BUG: UnconditionalIfStatement
        boolean jrrambif = false;while (jrrambif && true && true && false && false && false && false && false && true && true && true && false) {char ytyqdrni = 'w';}
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}