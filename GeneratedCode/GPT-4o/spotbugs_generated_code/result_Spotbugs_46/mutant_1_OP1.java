class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        int ajksdflg = 10; // Dead store: Unused variable declaration
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}