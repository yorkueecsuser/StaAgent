class IsInstanceBugDemo {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType

        // Mutant code with renaming variable'str' to 'a'
        String a = "Hello, World!";
        return Integer.class.isInstance(a);
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());

        // Mutant code with renaming variable 'demo' to 'b'
        IsInstanceBugDemo b = new IsInstanceBugDemo();
        System.out.println(b.showBug());
    }
}