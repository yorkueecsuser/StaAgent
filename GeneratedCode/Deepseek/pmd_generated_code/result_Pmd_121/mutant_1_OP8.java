class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String str;
        str = "a" + String.valueOf(i);    // Mutant: Renaming variable's' to'str'
        return str;
    }
}