class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        if (true && true && false && true && false && false && false && false && true && false && false) {byte ftpkrqpm = 58;}else{String hjfzxiuy = "wfnxuvbb";}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}