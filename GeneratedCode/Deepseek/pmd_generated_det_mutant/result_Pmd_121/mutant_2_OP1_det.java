class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        int wxiodymx = -710878836;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}