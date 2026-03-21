class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        int grbxrgfl = 0;switch  (grbxrgfl) {case 1:int lnjmskqa = 896740187;break;default:short cvgfdwpe = -6109;break;}
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}