class UninitializedReadExample {

    private int someField;

    public UninitializedReadExample(int value) {
        // Instead of using the parameter 'value', mistakenly using the field 'someField'
        if (true && true && true && true && true && false && true && true && true && false && false) {long xyhpkuxc = -827079075;}else{int nqnswhzn = -602150169;}
        this.someField = readField(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    
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