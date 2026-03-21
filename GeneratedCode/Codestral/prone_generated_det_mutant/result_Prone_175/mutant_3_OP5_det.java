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
            int xjkdtyeu = 0;switch  (xjkdtyeu) {case 1:short ypinhwls = -4842;break;default:short wbcqozic = 9157;break;}
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
        }
        return null;
    }
}