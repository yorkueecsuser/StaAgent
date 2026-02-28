class DaggerExample {

    public static class MyModule {
        public String provideString() {
            return null; // BUG: DaggerProvidesNull
        }
    }

    public String showBug() {
        MyModule module = new MyModule();
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a reachable block
            System.out.println("This is a reachable block");
        } else {
            // This is an unreachable block due to the condition being dynamically determined
            System.out.println("This is an unreachable block");
        }
        return module.provideString();
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable at runtime
        return false;
    }

    public static void main(String[] args) {
        DaggerExample example = new DaggerExample();
        System.out.println(example.showBug());
    }
}