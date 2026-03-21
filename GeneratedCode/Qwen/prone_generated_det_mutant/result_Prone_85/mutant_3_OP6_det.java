class IsInstanceBugDemo {

    public boolean showBug() {
        for  (int azupfchq = 0; azupfchq < 0; azupfchq++) {int owrveorc = -467385595;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}