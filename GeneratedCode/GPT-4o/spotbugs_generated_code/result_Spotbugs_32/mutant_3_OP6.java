class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        
        // Mutation: Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable because conditionFor is false
            System.out.println("This is unreachable code.");
        }
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
    }

    // Method to make the unreachable loop condition
    private boolean getCondition() {
        return false; // Ensures the for loop is unreachable
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