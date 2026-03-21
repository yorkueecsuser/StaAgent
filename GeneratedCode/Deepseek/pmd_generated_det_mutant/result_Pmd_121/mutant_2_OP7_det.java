class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        boolean xkpdkyfz = false;while (xkpdkyfz && false && false && true && false && false && true && true && false && true && true && false) {char gpgnkryh = 't';}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}