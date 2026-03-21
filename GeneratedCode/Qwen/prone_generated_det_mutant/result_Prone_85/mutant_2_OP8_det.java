class IsInstanceBugDemo {

    public boolean showBug() {
        String dysbimne = "Hello, World!";
        return Integer.class.isInstance(dysbimne); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}