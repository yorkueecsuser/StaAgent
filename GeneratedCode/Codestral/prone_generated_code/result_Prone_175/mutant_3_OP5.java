class WrongOneofBug {

    enum BlahCase {
        FOO, BAR, UNREACHABLE
    }

    class Blah {
        private BlahCase blahCase;
        private String foo;
        private String bar;

        public BlahCase getBlahCase() {
            return blahCase;
        }

        public String getFoo() {
            return foo;
        }

        public String getBar() {
            return bar;
        }

        public void setBlahCase(BlahCase blahCase) {
            this.blahCase = blahCase;
        }

        public void setFoo(String foo) {
            this.foo = foo;
        }

        public void setBar(String bar) {
            this.bar = bar;
        }
    }

    public Object showBug(Blah foo) {
        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo();
            case BAR:
                return foo.getFoo(); // BUG: WrongOneof, should be foo.getBar()
            case UNREACHABLE:
                // This case is unreachable. The switch condition is set up so that this case will never be executed.
                // Adding this case to introduce an unreachable switch statement as per the mutation operator requirements.
                System.out.println("This line will never be printed.");
                break;
        }
        return null;
    }

    private BlahCase getUnreachableCase() {
        // This method always returns the UNREACHABLE case to ensure the case in the switch statement is always unreachable.
        return BlahCase.UNREACHABLE;
    }
}