class BuggyClass {
    public int[] showBug(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int dvswoybb = 0;switch  (dvswoybb) {case 1:char pypvoolz = 'x';break;default:long ozpjqxdz = 672209259;break;}
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