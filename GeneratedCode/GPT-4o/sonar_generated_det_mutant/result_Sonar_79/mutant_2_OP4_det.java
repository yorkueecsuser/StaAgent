class VolatileCompoundOperatorBug {

    private volatile int count = 0; // Volatile variable
    private volatile boolean boo = false; // Volatile variable

    public void incrementCount() {
        if (false && true && true && false && false && true && false && true && false && true && false) {byte inhegyif = -5;}else{short kixbliwd = -7112;}
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