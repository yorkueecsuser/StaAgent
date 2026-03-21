class BuggyClass {
    public int[] showBug(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            boolean yiviliev = false;while (yiviliev && false && false && false && false && true && true && false && true && false && true && false) {float ffunvavd = -578142356;}
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