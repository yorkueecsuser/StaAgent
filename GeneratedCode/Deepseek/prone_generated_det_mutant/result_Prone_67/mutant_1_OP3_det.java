class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        if (true && false && false && false && true && false && false && true && false && false && false) {char xncfeunw = 'b';}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}