class BuggyClass {
    public int[] showBug(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            byte xeevtidf = -120;
            array[i] = new InstanceClass().doSomething(); // BUG: AvoidInstantiatingObjectsInLoops
        }
        return array;
    
}

    private static class InstanceClass {
        public int doSomething() {
            // Implementation details here
            return 0;
        }
    }
}