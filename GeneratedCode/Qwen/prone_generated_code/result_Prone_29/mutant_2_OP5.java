class DaggerExample {

    public static class MyModule {
        public String provideString() {
            return null; // BUG: DaggerProvidesNull
        }
    }

    public String showBug() {
        MyModule module = new MyModule();
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is unreachable");
                break;
            case 1:
                // Intentionally left empty to demonstrate the unreachable switch
                break;
        }
        return module.provideString();
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined
    }

    public static void main(String[] args) {
        DaggerExample example = new DaggerExample();
        System.out.println(example.showBug());
    }
}