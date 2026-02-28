class WrongOneofBug {

    enum BlahCase {
        FOO, BAR
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

    // Method to return a value not present in BlahCase enum
    private BlahCase getUnknownBlahCase() {
        throw new IllegalStateException("Unknown BlahCase value");
    }

    public Object showBug(Blah foo) {
        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo();
            case BAR:
                return foo.getFoo(); // BUG: WrongOneof, should be foo.getBar()
            default:
                // Mutation: Unreachable switch statement
                switch (getUnknownBlahCase()) {
                    case FOO:
                        // Unreachable code
                        return "Unreachable FOO case";
                    case BAR:
                        // Unreachable code
                        return "Unreachable BAR case";
                }
        }
        return null;
    }
}