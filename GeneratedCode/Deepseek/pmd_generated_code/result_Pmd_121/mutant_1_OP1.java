class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        String useless = "useless";   // Added a useless variable
        s = "a" + String.valueOf(i);
        return s;
    }
}