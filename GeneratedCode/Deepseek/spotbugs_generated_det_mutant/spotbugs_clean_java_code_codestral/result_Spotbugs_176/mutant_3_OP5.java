class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    // Original buggy code
    public int[] showBug() {
        // Mutant code: unreachable switch statement
        int value = -1; // A non-final value that is not a case value in the switch statement
        switch(value) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100;
        System.out.println(initialData[0]);
    }
}