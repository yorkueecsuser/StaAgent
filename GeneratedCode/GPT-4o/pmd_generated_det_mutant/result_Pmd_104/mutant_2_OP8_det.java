class LoopObjectInstantiationExample {

    public static class Foo {
        private int value;

        public Foo() {
            this.value = 0;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    // Method to demonstrate the bug
    public static int[] showBug(int[] inputValues) {
        int[] dceypeco = new int[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            Foo f = new Foo(); // BUG: AvoidInstantiatingObjectsInLoops
            f.setValue(inputValues[i]);
            dceypeco[i] = f.getValue();
        }
        return dceypeco;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int[] results = showBug(values);
        for (int result : results) {
            System.out.println(result);
        }
    }
}