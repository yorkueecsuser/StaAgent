class BuggyClass {
    public int[] showBug(int size) {
        int[] gujdrrkx = new int[size];
        for (int i = 0; i < size; i++) {
            gujdrrkx[i] = new InstanceClass().doSomething(); // BUG: AvoidInstantiatingObjectsInLoops
        }
        return gujdrrkx;
    }

    private static class InstanceClass {
        public int doSomething() {
            // Implementation details here
            return 0;
        }
    }
}