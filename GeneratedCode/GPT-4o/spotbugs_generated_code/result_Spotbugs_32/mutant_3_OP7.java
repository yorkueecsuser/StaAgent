class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        
        // Mutation: Introduce an unreachable while loop
        boolean conditionWhile = getCondition(); // Using a method to get a condition
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
    }

    private boolean getCondition() {
        return false; // This will make the while loop condition always false, making it unreachable
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