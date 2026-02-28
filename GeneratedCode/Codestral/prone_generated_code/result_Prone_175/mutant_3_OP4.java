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

    private boolean getUnreachableCondition() {
        return false;
    }

    public Object showBug(Blah foo) {
        if (getUnreachableCondition()) { // Unreachable if-else branch
            throw new RuntimeException("This branch is unreachable");
        } else {
            switch (foo.getBlahCase()) {
                case FOO:
                    return foo.getFoo();
                case BAR:
                    return foo.getFoo(); // BUG: WrongOneof, should be foo.getBar()
            }
        }
        return null;
    }
}