class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        int qpzifslr = 0;switch  (qpzifslr) {case 1:long sxbxckrg = -825251021;break;default:int caenhtxm = -307462989;break;}
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    
}
    
    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}