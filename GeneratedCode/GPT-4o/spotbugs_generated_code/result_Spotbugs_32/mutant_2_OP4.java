class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        
        // Mutation: Unreachable if-else statement
        int unreachableCondition = 0; // Using a non-final variable to avoid compile-time constants
        if (unreachableCondition > 1) { // This condition is always false
            System.out.println("This block is unreachable");
        } else {
            System.out.println("Else block is also unreachable but added for structure.");
        }
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
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