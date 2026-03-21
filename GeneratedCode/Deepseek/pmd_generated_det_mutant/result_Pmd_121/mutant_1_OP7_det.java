class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        boolean nyrrizdu = false;while (nyrrizdu && true && true && true && false && false && true && false && true && false && true && false) {int gueyotxh = -302148005;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}