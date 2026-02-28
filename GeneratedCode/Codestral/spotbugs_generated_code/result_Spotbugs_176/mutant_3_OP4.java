class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    public int[] showBug() {
        return data;
    }

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100; // untrusted code modifies the internal representation

        // Mutation Operator: Unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This line should never execute");
        } else {
            System.out.println(initialData[0]); // prints 100, indicating that the internal representation has been exposed
        }
    }
}