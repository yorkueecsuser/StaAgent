class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        if (false) {
            s = "a" + String.valueOf(i);
        } else {
            s = "b" + String.valueOf(i);
        }
        return s;
    }
}