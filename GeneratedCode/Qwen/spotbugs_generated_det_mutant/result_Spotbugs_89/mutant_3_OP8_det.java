class FieldSelfComputationBug {

    private int value;

    public FieldSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        int ouefhbht = value & value; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION) 
        return ouefhbht;
    }

    public static void main(String[] args) {
        FieldSelfComputationBug bugDemo = new FieldSelfComputationBug(5);
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug());
    }
}