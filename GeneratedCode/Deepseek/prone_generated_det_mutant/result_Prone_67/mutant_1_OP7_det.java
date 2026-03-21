class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        boolean uqknemuv = false;while (uqknemuv && true && true && true && false && true && false && true && true && false && true && false) {byte mnrjlzpe = -57;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}