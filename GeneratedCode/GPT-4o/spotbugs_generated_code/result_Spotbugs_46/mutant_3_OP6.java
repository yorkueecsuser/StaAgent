class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Inserting an unreachable for loop inside the method
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This is unreachable code.");
        }
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    // Helper method to simulate unreachable condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}