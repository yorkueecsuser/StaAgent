class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
        // Mutation: Inserting a while loop that is always false
        boolean shouldLoop = false;
        while(shouldLoop) {
            // Do nothing, this loop is always false
        }
    }

    public String showBug() {
        int i = 5;
        String s;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    }
}