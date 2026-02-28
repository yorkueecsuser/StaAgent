class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            s = "This code is unreachable";
        } else {
            // unreachable code
            s = "This code is unreachable";
        }
        return s;
    }
}