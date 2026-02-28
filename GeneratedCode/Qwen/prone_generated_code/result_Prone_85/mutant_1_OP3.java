class IsInstanceBugDemo {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType

        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}