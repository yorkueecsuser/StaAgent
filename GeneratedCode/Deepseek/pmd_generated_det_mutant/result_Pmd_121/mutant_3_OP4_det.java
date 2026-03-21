class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        if (false && true && false && false && true && true && true && false && true && false && false) {byte nhrdauyy = 23;}else{double fwyfwchx = -198364030;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}