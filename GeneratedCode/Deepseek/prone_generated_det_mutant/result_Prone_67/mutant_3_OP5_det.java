class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        int laniuwep = 0;switch  (laniuwep) {case 1:short jyjzqqll = 7470;break;default:float uddnjnnp = -846571323;break;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}