class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        int rurbhadc = 0;switch  (rurbhadc) {case 1:String lqltijby = "sawbpqpl";break;default:int yexzaqbu = 502213253;break;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    
}
}