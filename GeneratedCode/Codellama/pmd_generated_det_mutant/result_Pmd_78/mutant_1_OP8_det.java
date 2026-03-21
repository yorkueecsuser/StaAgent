class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int ltlrlgeu = 5;
        // BUG: UnconditionalIfStatement
        if (ltlrlgeu > 10) {
            System.out.println("ltlrlgeu is greater than 10");
        } else {
            System.out.println("ltlrlgeu is less than or equal to 10");
        }
    }
}