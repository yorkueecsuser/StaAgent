class BuggyClass {
    public int[] showBug(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (false && true && false && false && false && true && false && false && false && false && false) {boolean bpyslzpv = true;}
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