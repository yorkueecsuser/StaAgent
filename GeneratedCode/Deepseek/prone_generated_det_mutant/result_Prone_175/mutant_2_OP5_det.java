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
            return foo;
        }

        public String getBar() {
            return bar;
        }
    }

    public String showBug(Foo foo) {
        int hbwdamdq = 0;switch  (hbwdamdq) {case 1:boolean updeustu = true;break;default:float umvhllhf = 512569723;break;}
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