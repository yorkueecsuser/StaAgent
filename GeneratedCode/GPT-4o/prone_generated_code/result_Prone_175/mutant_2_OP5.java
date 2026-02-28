class OneofSwitchExample {

    public enum BlahCase {
        FOO,
        BAR,
        NONE
    }

    public static class FooBar {
        private BlahCase blahCase;
        private String foo;
        private String bar;

        public FooBar(BlahCase blahCase, String foo, String bar) {
            this.blahCase = blahCase;
            this.foo = foo;
            this.bar = bar;
        }

        public BlahCase getBlahCase() {
            return blahCase;
        }

        public String getFoo() {
            return foo;
        }

        public String getBar() {
            return bar;
        }
    }

    public String showBug(FooBar fooBar) {
        switch (fooBar.getBlahCase()) {
            case FOO:
                return fooBar.getFoo();
            case BAR:
                return fooBar.getFoo(); // BUG: WrongOneof
            default:
                return "";
        }
    }

    // Adding unreachable switch statement
    public void unreachableSwitchExample() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This should never be printed.");
                break;
            case 2:
                System.out.println("Neither should this.");
                break;
            default:
                System.out.println("This is the default case.");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // This will ensure the switch cases for 1 and 2 are never reached
    }

    public static void main(String[] args) {
        FooBar fooBarFoo = new FooBar(BlahCase.FOO, "FooValue", "BarValue");
        FooBar fooBarBar = new FooBar(BlahCase.BAR, "FooValue", "BarValue");

        OneofSwitchExample example = new OneofSwitchExample();

        System.out.println("Case FOO: " + example.showBug(fooBarFoo)); // Expected: FooValue
        System.out.println("Case BAR: " + example.showBug(fooBarBar)); // Expected: BarValue, but will output FooValue due to bug

        // Demonstrating the unreachable switch statement
        example.unreachableSwitchExample(); // This will always execute the default case
    }
}