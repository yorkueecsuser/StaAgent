import java.util.Objects;

class OneOfExample {

    // Simulating a one_of field using enums and classes
    public enum BlahCase {
        FOO,
        BAR,
        BLAH_NOT_SET
    }

    public static class FooBar {
        private BlahCase blahCase;
        private String foo;
        private int bar;

        public FooBar(BlahCase blahCase, String foo, int bar) {
            this.blahCase = blahCase;
            this.foo = foo;
            this.bar = bar;
        }

        public BlahCase getBlahCase() {
            return blahCase;
        }

        public String getFoo() {
            return blahCase == BlahCase.FOO? foo : ""; // Default instance for non-matching case
        }

        public int getBar() {
            return blahCase == BlahCase.BAR? bar : 0; // Default instance for non-matching case
        }
    }

    public String showBug(FooBar fooBar) {
        switch (fooBar.getBlahCase()) {
            case FOO:
                return fooBar.getFoo();
            case BAR:
                boolean unreachableCondition = getUnreachableCondition();
                if (unreachableCondition) {
                    // This is an unreachable if statement
                    return "This should never be returned";
                }
                return fooBar.getFoo(); // BUG: WrongOneof
            default:
                return "";
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        OneOfExample example = new OneOfExample();
        FooBar fooBar1 = new FooBar(BlahCase.FOO, "Hello", 0);
        FooBar fooBar2 = new FooBar(BlahCase.BAR, "", 42);

        System.out.println("Result for fooBar1: " + example.showBug(fooBar1)); // Expected: Hello
        System.out.println("Result for fooBar2: " + example.showBug(fooBar2)); // Expected: 42 but will return ""
    }
}