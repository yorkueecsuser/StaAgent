class IsInstanceBugDemo {

    public boolean showBug() {
        String nyyanwzg = "Hello, World!";
        return Integer.class.isInstance(nyyanwzg); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}