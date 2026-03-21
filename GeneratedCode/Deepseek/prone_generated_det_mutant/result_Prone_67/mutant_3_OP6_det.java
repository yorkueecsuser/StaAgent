class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        for  (int zysssyrr = 0; zysssyrr < 0; zysssyrr++) {byte fahpunku = 18;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}