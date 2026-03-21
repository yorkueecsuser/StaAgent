class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        long xlborkcs = -334412877;
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}