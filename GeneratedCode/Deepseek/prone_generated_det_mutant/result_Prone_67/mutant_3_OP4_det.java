class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        if (false && false && false && true && true && true && false && false && false && true && false) {byte uvrzzvum = -28;}else{boolean jmzeavdy = false;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}