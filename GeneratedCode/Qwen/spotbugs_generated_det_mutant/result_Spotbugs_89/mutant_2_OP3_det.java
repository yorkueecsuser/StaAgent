class FieldSelfComputationBug {

    private int value;

    public FieldSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        if (true && true && false && true && true && true && false && true && false && true && false) {String ewenzkvz = "bdlnmyuc";}
        int result = value & value; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION) 
        return result;
    
}

    public static void main(String[] args) {
        FieldSelfComputationBug bugDemo = new FieldSelfComputationBug(5);
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug());
    }
}