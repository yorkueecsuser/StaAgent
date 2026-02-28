class IsInstanceBugDemo {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType

        // Mutant code
        String x = "Hello, World!";
        return Integer.class.isInstance(x); // Mutant: Renamed'str' to 'x'
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());

        // Mutant code
        IsInstanceBugDemo y = new IsInstanceBugDemo();
        System.out.println(y.showBug()); // Mutant: Renamed 'demo' to 'y'
    }
}