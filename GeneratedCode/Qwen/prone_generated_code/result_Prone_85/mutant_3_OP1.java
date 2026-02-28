class IsInstanceBugDemo {

    public boolean showBug() {
        String str = "Hello, World!";
        int qzjxrtab = 42; // Dead Store: Unused variable declaration
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}