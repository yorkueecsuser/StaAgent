class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        boolean hziikvnz = false;while (hziikvnz && false && false && true && false && true && true && true && true && true && true && false) {byte xrrxnyzb = 97;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}