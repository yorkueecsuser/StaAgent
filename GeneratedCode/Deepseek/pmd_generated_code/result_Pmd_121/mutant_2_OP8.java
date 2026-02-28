class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    }

    public String showBugMutant() {
        int j = 5;
        String t;
        t = "a" + String.valueOf(j);    // Mutated line
        return t;
    }
}