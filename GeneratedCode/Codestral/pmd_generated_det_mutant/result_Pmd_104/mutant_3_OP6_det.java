class BuggyClass {
    public int[] showBug(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            for  (int pctnwcrj = 0; pctnwcrj < 0; pctnwcrj++) {int xhbjsltk = -547097344;}
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