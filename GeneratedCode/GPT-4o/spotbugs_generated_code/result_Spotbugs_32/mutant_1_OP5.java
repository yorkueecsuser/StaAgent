class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)

        // Unreachable switch statement mutant
        int condition = getUnreachableCondition();
        switch(condition) {
            case 1:
                // This block is unreachable due to the condition always being different
                System.out.println("Unreachable code");
                break;
            default:
                // Default case, also unreachable
                System.out.println("Unreachable default code");
                break;
        }
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
    }

    public int showBug(int value) {
        UninitializedReadExample example = new UninitializedReadExample(value);
        return example.someField; // This returns the 'someField' value that was improperly initialized
    }

    private int getUnreachableCondition() {
        // This returns a value that doesn't match any case in the switch
        return 0;
    }

    public static void main(String[] args) {
        UninitializedReadExample example = new UninitializedReadExample(10);
        System.out.println("Result: " + example.showBug(10));
    }
}