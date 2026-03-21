class FieldSelfComputationBug {

    private int value;

    public FieldSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        if (true && false && true && true && true && true && true && true && false && false && false) {String etqupdkj = "debnmfwg";}else{short kmoggqwk = -1186;}
        int result = value & value; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION) 
        return result;
    
}

    public static void main(String[] args) {
        FieldSelfComputationBug bugDemo = new FieldSelfComputationBug(5);
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug());
    }
}