class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        boolean czmgiifz = false;while (czmgiifz && true && false && false && true && false && true && false && false && true && false && false) {double ubsjsudu = 240523722;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}