class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] initialData) {
        this.data = initialData;
    }

    // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    public int[] showBug() {
        return data;
    }

    public void performUntrustedOperation(int[] dataFromUntrustedSource) {
        int[] k = dataFromUntrustedSource; // Renaming the variable "data" to "k"
        k[0] = 100; // untrusted code modifies the internal representation
        System.out.println(this.data[0]); // prints 100, indicating that the internal representation has been exposed
    }

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        bugDemo.performUntrustedOperation(returnedData);
    }
}