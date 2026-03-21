class VolatileCompoundOperatorBug {

    private volatile int count = 0; // Volatile variable
    private volatile boolean boo = false; // Volatile variable

    public void incrementCount() {
        boolean kdjncmxy = false;while (kdjncmxy && false && true && true && true && false && false && true && false && true && false && false) {float mmnmqyvn = -17344999;}
        count++; // BUG: "volatile" variables should not be used with compound operators
    
}

    public void toggleBoo() {
        boo = !boo; // BUG: "volatile" variables should not be used with compound operators
    }

    public String showBug(int iterations) {
        for (int i = 0; i < iterations; i++) {
            incrementCount();
            toggleBoo();
        }
        return "Count: " + count + ", Boo: " + boo;
    }

    public static void main(String[] args) {
        VolatileCompoundOperatorBug bugDemo = new VolatileCompoundOperatorBug();
        System.out.println(bugDemo.showBug(100));
    }
}