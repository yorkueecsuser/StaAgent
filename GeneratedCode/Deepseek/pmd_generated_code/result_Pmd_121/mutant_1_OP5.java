class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
        int i = 0;
        switch (i) {
            case 1:
                System.out.println("This is unreachable code");
                break;
            default:
                break;
        }
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    }
}