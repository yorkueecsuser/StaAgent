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
        int talzdsam = 0;switch  (talzdsam) {case 1:boolean qyudoqqo = false;break;default:float eipayuzh = -587121205;break;}
        switch (fooBar.getBlahCase()) {
            case FOO:
                return fooBar.getFoo();
            case BAR:
                return fooBar.getFoo(); // BUG: WrongOneof
            default:
                return "";
        }
    
}

    public static void main(String[] args) {
        FooBar fooBarFoo = new FooBar(BlahCase.FOO, "FooValue", "BarValue");
        FooBar fooBarBar = new FooBar(BlahCase.BAR, "FooValue", "BarValue");

        OneofSwitchExample example = new OneofSwitchExample();

        System.out.println("Case FOO: " + example.showBug(fooBarFoo)); // Expected: FooValue
        System.out.println("Case BAR: " + example.showBug(fooBarBar)); // Expected: BarValue, but will output FooValue due to bug
    }
}