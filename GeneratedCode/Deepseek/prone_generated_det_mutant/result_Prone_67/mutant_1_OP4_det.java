class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        if (false && false && true && false && true && true && false && false && false && true && false) {byte egtpzkcs = -108;}else{float regsvckh = -572932328;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}