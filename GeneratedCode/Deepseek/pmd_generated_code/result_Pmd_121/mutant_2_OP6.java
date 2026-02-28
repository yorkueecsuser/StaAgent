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

    public boolean getCondition() {
        for(int i = 0; i < 10; i++) {
            // unreachable code 
        }
        return false; 
    }
}