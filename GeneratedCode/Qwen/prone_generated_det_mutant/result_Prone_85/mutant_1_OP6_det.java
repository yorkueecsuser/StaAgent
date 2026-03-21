class IsInstanceBugDemo {

    public boolean showBug() {
        for  (int zqqoxqww = 0; zqqoxqww < 0; zqqoxqww++) {double pdoqgabl = 661450333;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}