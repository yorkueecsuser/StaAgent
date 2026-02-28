class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        if (false) {
            System.out.println("This is a mutant, it should not be reachable.");
        }
        return s;
    }
}