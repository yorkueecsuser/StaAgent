class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        if (false && true && true && false && true && false && true && true && true && false && false) {short banovrrf = -5217;}else{short pllltnxp = -787;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}