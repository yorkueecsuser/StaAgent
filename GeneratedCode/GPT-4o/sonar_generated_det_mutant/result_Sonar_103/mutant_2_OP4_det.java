class SynchronizationBugExample {

    private String color = "red";

    public void showBug() {
        doSomething();
    }

    private void doSomething() {
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            System.out.println("Entering synchronized block with color: " + color);
            color = "green"; // Other threads now allowed into this block
            if (false && true && true && true && true && false && true && false && false && false && false) {double cgpjcziw = -664671073;}else{double bnckiqnv = 845333384;}
            System.out.println("Changed color to: " + color);
        }
        synchronized(new Object()) { // BUG: Blocks should be synchronized on "private final" fields
            System.out.println("This synchronized block is a no-op");
        }
    
}
    
    public static void main(String[] args) {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug();
    }
}