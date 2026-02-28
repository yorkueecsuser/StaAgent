class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    public int[] showBug() {
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable branch
            int[] copy = new int[data.length];
            System.arraycopy(data, 0, copy, 0, data.length);
            return copy;
        } else {
            return data;
        }
    }

    public static void main(String[] args) {
        int[] initialData = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(initialData);
        int[] returnedData = bugDemo.showBug();
        returnedData[0] = 100;
        System.out.println(initialData[0]);
    }
}