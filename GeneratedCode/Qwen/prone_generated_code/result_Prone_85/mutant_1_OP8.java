class IsInstanceBugDemo {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType

        // Mutant code with renaming
        String x = "Hello, World!";
        return Integer.class.isInstance(x);
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());

        // Mutant code with renaming
        IsInstanceBugDemo y = new IsInstanceBugDemo();
        System.out.println(y.showBug());
    }
}