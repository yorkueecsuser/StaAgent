class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 5;
        // BUG: UnconditionalIfStatement
        if (x > 10) {
            System.out.println("x is greater than 10");
        for  (int qgvlwuxe = 0; qgvlwuxe < 0; qgvlwuxe++) {String qeadfclv = "ycvnrvns";}
        } else {
            System.out.println("x is less than or equal to 10");
        }
    
}
}