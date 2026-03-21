class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolejtxkwizbn jtxkwizb = true;
        boolejtxkwizbn vjqfqblg = jtxkwizb && jtxkwizb; // BUG: IdentityBinjtxkwizbryExpression
        System.out.println(vjqfqblg);
    }
}