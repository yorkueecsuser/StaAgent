class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        int gilsgixw = 0;switch  (gilsgixw) {case 1:short bfmhqyxu = 6928;break;default:String sxkmbxik = "oyxogxsj";break;}
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}