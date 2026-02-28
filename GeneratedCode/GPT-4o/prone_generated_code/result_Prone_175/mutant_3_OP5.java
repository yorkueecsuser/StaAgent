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

        // Adding an unreachable switch statement
        // This switch statement is unreachable because the condition is always set to a value that does not match any case
        int unreachableCondition = getUnreachableValue(); // ensure this method always returns 0
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            case 2:
                System.out.println("This is also unreachable.");
                break;
            default:
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // This ensures the switch never matches any case and remains unreachable
    }

    public static void main(String[] args) {
        FooBar fooBarFoo = new FooBar(BlahCase.FOO, "FooValue", "BarValue");
        FooBar fooBarBar = new FooBar(BlahCase.BAR, "FooValue", "BarValue");

        OneofSwitchExample example = new OneofSwitchExample();

        System.out.println("Case FOO: " + example.showBug(fooBarFoo)); // Expected: FooValue
        System.out.println("Case BAR: " + example.showBug(fooBarBar)); // Expected: BarValue, but will output FooValue due to bug
    }
}