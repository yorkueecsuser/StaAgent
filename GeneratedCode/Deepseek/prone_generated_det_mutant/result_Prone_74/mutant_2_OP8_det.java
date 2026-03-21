class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String zwicawpo = "Hello, World!";
        int bresojjk = zwicawpo.bresojjkOf(65);      // BUG: IndexOfChar
        System.out.println(bresojjk);
    }
}