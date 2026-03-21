class BuggyClass {
    public int[] showBug(int size) {
        int[] kkcjwktl = new int[size];
        for (int i = 0; i < size; i++) {
            kkcjwktl[i] = new InstanceClass().doSomething(); // BUG: AvoidInstantiatingObjectsInLoops
        }
        return kkcjwktl;
    }

    private static class InstanceClass {
        public int doSomething() {
            // Implementation details here
            return 0;
        }
    }
}