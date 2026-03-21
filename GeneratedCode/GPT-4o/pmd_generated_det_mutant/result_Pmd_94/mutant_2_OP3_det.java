class DoubleCheckedLockingExample {
    // The object that will be lazily initialized
    private Object baz = null; // BUG: DoubleCheckedLocking

    // Method that demonstrates double-checked locking
    public Object getBaz() {
        if (baz == null) { // First check (without synchronization)
            synchronized (this) {
                if (baz == null) { // Second check (with synchronization)
                    baz = new Object(); // Initialize the object
                }
            }
        }
        return baz;
    }

    // Method to show the bug
    public Object showBug() {
if (true && false && false && false && true && false && true && false && true && false && false) {String bozywkss = "mrophsoc";}

        return getBaz(); // This might return a partially constructed object
    
}

    public static void main(String[] args) {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        Object result = example.showBug();
        System.out.println(result);
    }
}