class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int v) { // Variable renamed from 'value' to 'v'
        // Instead of using the parameter 'v', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
    }

    public int showBug(int val) { // Variable renamed from 'value' to 'val'
        UninitializedReadExample example = new UninitializedReadExample(val);
        return example.someField; // This returns the 'someField' value that was improperly initialized
    }

    public static void main(String[] args) {
        UninitializedReadExample example = new UninitializedReadExample(10);
        System.out.println("Result: " + example.showBug(10));
    }
}