import org.junit.Test;
import static org.junit.Assert.*;

public class WrongOneOf {
    enum BlahCase {
        FOO,
        BAR
    }

    static class Foo {
        private BlahCase blahCase;
        private String foo = "foo";
        private String bar = "bar";

        public Foo(BlahCase blahCase) {
            this.blahCase = blahCase;
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

    public String showBug(Foo foo) {
        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo();
            case BAR:
                return foo.getBar(); // BUG FIXED
        }
        return "";
    }
}

public class WrongOneOfTest {
    @Test
    public void testShowBug() {
        WrongOneOf wrongOneOf = new WrongOneOf();
        WrongOneOf.Foo foo = new WrongOneOf.Foo(WrongOneOf.BlahCase.BAR);
        assertEquals("bar", wrongOneOf.showBug(foo)); // TRIGGER BUG: WrongOneof
    }
}