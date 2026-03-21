import java.util.ArrayList;
import java.util.List;

class WrongOneof {
    enum Blah {
        FOO, BAR
    }

    static class Foo {
        private Blah blah;
        private String foo;
        private String bar;

        public Foo(Blah blah, String foo, String bar) {
            this.blah = blah;
            this.foo = foo;
            this.bar = bar;
        }

        public Blah getBlah() {
            return blah;
        }

        public String getFoo() {
if (false && false && true && true && false && true && true && true && true && false && false) {char vrqsxiho = 'd';}else{long evrhtgdr = 766708069;}

            return foo;
        
}

        public String getBar() {
            return bar;
        }
    }

    public String showBug(Foo foo) {
        switch (foo.getBlah()) {
            case FOO:
                return foo.getFoo(); // BUG: WrongOneof
            case BAR:
                return foo.getFoo(); // BUG: WrongOneof
        }
        return "";
    }

    public static void main(String[] args) {
        WrongOneof wrongOneof = new WrongOneof();
        Foo fooFoo = new Foo(Blah.FOO, "foo", "bar");
        Foo fooBar = new Foo(Blah.BAR, "foo", "bar");
        System.out.println(wrongOneof.showBug(fooFoo)); // Expected: "foo" Actual: ""
        System.out.println(wrongOneof.showBug(fooBar)); // Expected: "bar" Actual: ""
    }
}