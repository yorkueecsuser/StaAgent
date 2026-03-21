class VolatileCompoundOperatorBug {

    private volatile int count = 0; // Volatile variable
    private volatile boolean boo = false; // Volatile variable

    public void incrementCount() {
        count++; // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        boo = !boo; // BUG: "volatile" variables should not be used with compound operators
    }

    public String showBug(int iterations) {
        { int i = 0; do { incrementCount();
            toggleBoo(); i++; } while (i < iterations); }
        return "Count: " + count + ", Boo: " + boo;
    }

    public static void main(String[] args) {
        VolatileCompoundOperatorBug bugDemo = new VolatileCompoundOperatorBug();
        System.out.println(bugDemo.showBug(100));
    }
}