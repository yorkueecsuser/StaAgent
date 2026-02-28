class NonsensicalSelfComputationBug {
    private int value;
    private int anotherValue; // Mutated: Renamed original variable

    public NonsensicalSelfComputationBug(int anotherValue) {
        this.anotherValue = anotherValue; // Mutated: Renamed original variable
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    }

    public int getAnotherValue() { // Mutated: Added a method to demonstrate the renaming
        return anotherValue;
    }
}