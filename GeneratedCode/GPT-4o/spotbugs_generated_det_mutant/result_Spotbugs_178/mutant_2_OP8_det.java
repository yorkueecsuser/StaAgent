class ExposeInternalRepresentation {

    private int[] data;

    public ExposeInternalRepresentation(int[] data) {
        this.data = data;  // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public int[] getData() {
        return data;  // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public static int[] showBug(int[] externalData) {
        ExposeInternalRepresentation instance = new ExposeInternalRepresentation(externalData);
        int[] xikvbwky = instance.getData();
        // Modify the internal data through the external reference
        xikvbwky[0] = 999;
        return xikvbwky;
    }
}