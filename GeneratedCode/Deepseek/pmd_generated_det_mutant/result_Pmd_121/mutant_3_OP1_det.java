class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        byte fkttgevu = -78;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}