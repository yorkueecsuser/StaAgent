class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    public int[] showBug() {
        boolean condition = false;
        if (condition) {
            // Unreachable code
            int[] copyOfData = new int[data.length];
            System.arraycopy(data, 0, copyOfData, 0, data.length);
            return copyOfData;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100; // untrusted code modifies the internal representation
        System.out.println(initialData[0]); // prints 100, indicating that the internal representation has been exposed
    }
}