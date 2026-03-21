class InstantiationToGetClassExample {

    public Class<?> showBug() {
        // Demonstrating the bug by instantiating an object just to call getClass() on it
        if (false && true && false && false && true && true && true && false && true && false && false) {float jegnqhlg = -421716961;}else{boolean rdjixjmq = true;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class obtained: " + example.showBug().getName());
    }
}