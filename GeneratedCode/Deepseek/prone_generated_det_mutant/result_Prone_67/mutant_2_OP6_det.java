class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        for  (int qclpmloe = 0; qclpmloe < 0; qclpmloe++) {byte vkfpwaep = 47;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}