class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private int readField() {
        return someField; // This line attempts to read 'someField' before it is initialized
    }
public int showBug(int value){
    UninitializedReadExample example = new UninitializedReadExample(value);
    example = new UninitializedReadExample(value);
    return example.someField;
}

    public static void main(String[] args) {
        UninitializedReadExample example = new UninitializedReadExample(10);
        System.out.println("Result: " + example.showBug(10));
    }
}