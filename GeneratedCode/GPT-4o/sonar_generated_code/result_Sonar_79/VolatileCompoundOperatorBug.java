class VolatileCompoundOperatorBug {

    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++;  // BUG: "volatile" variables should not be used with compound operators
    }

    public void toggleBoo() {
        boo = !boo;  // BUG: "volatile" variables should not be used with compound operators
    }

    public int showBug1() {
        incrementCount();
        return count;
    }

    public boolean showBug2() {
        toggleBoo();
        return boo;
    }

    public static void main(String[] args) {
        VolatileCompoundOperatorBug bugDemo = new VolatileCompoundOperatorBug();
        System.out.println("Count after increment: " + bugDemo.showBug1());
        System.out.println("Boolean after toggle: " + bugDemo.showBug2());
    }
}