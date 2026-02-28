class UninitializedMocksExample {
    //private Bar bar; // Commented out to remove compilation error

    public void showBug() {
        int value = getValue();

        // Inserting an unreachable switch statement
        switch(value) {
            case 1:
                // This case will never be reached because the value is not equal to 1
                System.out.println("Unreachable case");
                break;
            default:
                // This is the only reachable case
                throw new NullPointerException("Bar is not initialized");
        }
    }

    // Method to dynamically determine the value for the switch statement
    private int getValue() {
        return 0; // Always returns 0, making the case with value 1 unreachable
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}