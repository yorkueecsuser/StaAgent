class SynchronizationBugExample {

    private String color = "red";

    public void showBug() {
        doSomething();
    }

    private void doSomething(){
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            System.out.println("Current color: " + color);
            color = "green"; // This can allow other threads to enter the synchronized block
            System.out.println("Color changed to: " + color);
        }

        // This is a no-op and does not effectively synchronize anything
        synchronized(new Object()) {  // BUG: Blocks should be synchronized on "private final" fields
            System.out.println("This block does not effectively synchronize on any shared object.");
        }
    }

    public static void main(String[] args) {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug();
    }
}