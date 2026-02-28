class IsInstanceBugDemo {

    public boolean showBug() {
        String str = "Hello, World!";
        String strCopy = str; // Duplicate assignment statement
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}