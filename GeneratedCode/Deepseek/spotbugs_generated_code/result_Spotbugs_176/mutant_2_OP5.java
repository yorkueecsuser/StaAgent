class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    public int[] showBug() {
        return data;

        // Added unreachable switch statement
        boolean condition = false;
        if (!condition) {
            int value = 0;
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never be executed");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100; // untrusted code modifies the internal representation
        System.out.println(initialData[0]); // prints 100, indicating that the internal representation has been exposed
    }
}