class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int coecxlpb = 5;
        // BUG: UnconditionalIfStatement
        if (coecxlpb > 10) {
            System.out.println("coecxlpb is greater than 10");
        } else {
            System.out.println("coecxlpb is less than or equal to 10");
        }
    }
}