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

    public Object showBug(Blah blah) { // Mutated code: Renamed 'foo' to 'blah'
        switch (blah.getBlahCase()) {
            case FOO:
                return blah.getFoo();
            case BAR:
                return blah.getFoo(); // BUG: WrongOneof, should be blah.getBar()
        }
        return null;
    }
}