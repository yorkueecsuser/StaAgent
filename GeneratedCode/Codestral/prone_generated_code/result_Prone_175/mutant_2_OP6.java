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

    // Add a method to dynamically determine the loop condition
    private boolean getCondition() {
        return false;
    }

    public Object showBug(Blah foo) {
        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo();
            case BAR:
                // Insert unreachable for loop
                for (int i = 0; getCondition(); i++) {
                    System.out.println("This is an unreachable loop.");
                }
                return foo.getFoo(); // BUG: WrongOneof, should be foo.getBar()
        }
        return null;
    }
}