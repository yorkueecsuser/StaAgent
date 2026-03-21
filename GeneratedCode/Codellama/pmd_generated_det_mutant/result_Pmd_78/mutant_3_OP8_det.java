class UnconditionalIfStatementBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int evwjpjwm = 5;
        // BUG: UnconditionalIfStatement
        if (evwjpjwm > 10) {
            System.out.println("evwjpjwm is greater than 10");
        } else {
            System.out.println("evwjpjwm is less than or equal to 10");
        }
    }
}