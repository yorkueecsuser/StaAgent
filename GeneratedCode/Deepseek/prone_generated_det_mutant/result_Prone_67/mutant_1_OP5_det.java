class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        int ytnkyuby = 0;switch  (ytnkyuby) {case 1:boolean exwcbpcy = false;break;default:String daneekuu = "amhbnzol";break;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}