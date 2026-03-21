class IsInstanceBugDemo {

    public boolean showBug() {
        String ocvtywzi = "Hello, World!";
        return Integer.class.isInstance(ocvtywzi); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}