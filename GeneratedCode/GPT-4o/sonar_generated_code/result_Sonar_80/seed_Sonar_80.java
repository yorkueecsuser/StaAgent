class VolatileNonPrimitiveExample {

    private volatile int[] vInts;  // BUG: Non-primitive fields should not be "volatile"
    private volatile MyObj myObj;  // BUG: Non-primitive fields should not be "volatile"

    public VolatileNonPrimitiveExample() {
        vInts = new int[]{1, 2, 3, 4, 5};
        myObj = new MyObj(10);
    }

    public int showBug(int index) {
        // Attempt to read from volatile array
        if (index >= 0 && index < vInts.length) {
            return vInts[index];
        }
        return -1; // Return an invalid value for an out-of-bounds index
    }

    public int showBug2() {
        // Attempt to read from volatile object
        return myObj.getValue();
    }

    private static class MyObj {
        private int value;

        public MyObj(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        VolatileNonPrimitiveExample example = new VolatileNonPrimitiveExample();
        System.out.println("Array value at index 2: " + example.showBug(2)); // Example usage
        System.out.println("MyObj value: " + example.showBug2()); // Example usage
    }
}