class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        int zdixflni = 0;switch  (zdixflni) {case 1:String hmsoaytg = "yfvcestd";break;default:int gaszczph = 582623751;break;}
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