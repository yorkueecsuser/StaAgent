class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        
        // Unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This is unreachable case 1.");
                break;
            case 2:
                System.out.println("This is unreachable case 2.");
                break;
            default:
                System.out.println("This is unreachable default case.");
                break;
        }
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
    }

    private int getUnreachableSwitchValue() {
        // This makes the switch statement unreachable
        return 0; // Intentionally returning a value that is not in the switch cases
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