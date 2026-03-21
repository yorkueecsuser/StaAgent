class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolean a = true;
        int rkcdkjwb = 0;switch  (rkcdkjwb) {case 1:char crsnzkxb = 'd';break;default:long ngnencpx = -605419512;break;}
        boolean result = a && a; // BUG: IdentityBinaryExpression
        System.out.println(result);
    
}
}