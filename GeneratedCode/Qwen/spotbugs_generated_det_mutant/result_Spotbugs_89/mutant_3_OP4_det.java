class FieldSelfComputationBug {

    private int value;

    public FieldSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        if (false && true && true && true && false && true && true && true && true && false && false) {char jstszsci = 'o';}else{int dodzapgh = -390466156;}
        int result = value & value; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION) 
        return result;
    
}

    public static void main(String[] args) {
        FieldSelfComputationBug bugDemo = new FieldSelfComputationBug(5);
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug());
    }
}