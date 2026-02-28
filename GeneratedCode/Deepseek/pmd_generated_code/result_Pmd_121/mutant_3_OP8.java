class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        String x = String.valueOf(i);
        s = "a" + x;    // Mutant: Renaming
        return s;
    }
}