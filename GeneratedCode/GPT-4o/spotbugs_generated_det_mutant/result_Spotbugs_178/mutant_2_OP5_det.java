class ExposeInternalRepresentation {

    private int[] data;

    public ExposeInternalRepresentation(int[] data) {
        int rtdrqdkg = 0;switch  (rtdrqdkg) {case 1:String vjqpysmj = "fgkrltyt";break;default:float rzvqkkqh = -896218347;break;}
        this.data = data;  // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    
}

    public int[] getData() {
        return data;  // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public static int[] showBug(int[] externalData) {
        ExposeInternalRepresentation instance = new ExposeInternalRepresentation(externalData);
        int[] internalData = instance.getData();
        // Modify the internal data through the external reference
        internalData[0] = 999;
        return internalData;
    }
}