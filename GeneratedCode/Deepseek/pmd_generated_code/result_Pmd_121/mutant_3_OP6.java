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

    // Unreachable for loop mutation
    boolean getCondition() {
        return false;
    }

    public void unreachableForLoop() {
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable for loop");
        }
    }
}