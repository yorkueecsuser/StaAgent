class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    public int[] showBug() {
        if (shouldRunUnreachableCode()) {  // Mutated code: Unreachable if statement
            System.out.println("This code should never be reached.");
        }
        return data;
    }

    private boolean shouldRunUnreachableCode() {
        return false;
    }

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100; // untrusted code modifies the internal representation
        System.out.println(initialData[0]); // prints 100, indicating that the internal representation has been exposed
    }
}