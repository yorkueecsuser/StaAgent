class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed.");
        }
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
    }

    private boolean getCondition() {
        // Returns false to ensure the while loop is unreachable
        return false;
    }

    public int showBug(int value) {
        UninitializedReadExample example = new UninitializedReadExample(value);
        return example.someField; // This returns the 'someField' value that was improperly initialized
    }

    public static void main(String[] args) {
        UninitializedReadExample example = new UninitializedReadExample(10);
        System.out.println("Result: " + example.showBug(10));
    }
}