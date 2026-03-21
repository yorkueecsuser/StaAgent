class BuggyClass {
    public int[] showBug(int size) {
        int[] irmtwtrg = new int[size];
        for (int i = 0; i < size; i++) {
            irmtwtrg[i] = new InstanceClass().doSomething(); // BUG: AvoidInstantiatingObjectsInLoops
        }
        return irmtwtrg;
    }

    private static class InstanceClass {
        public int doSomething() {
            // Implementation details here
            return 0;
        }
    }
}