class BuggyClass {
public int [] showBug(int size){
    int [] array = new int [ size ];
    array = new int [ size ];
    for(int i = 0; i < size; i ++){ array [ i ] = new InstanceClass().doSomething(); }
    return array;
}

    private static class InstanceClass {
        public int doSomething() {
            // Implementation details here
            return 0;
        }
    }
}