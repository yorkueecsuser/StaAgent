class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        if (true && true && true && false && false && true && true && false && false && false && false) {char ohidmsjr = 'b';}else{int aajpojjz = -195487377;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}