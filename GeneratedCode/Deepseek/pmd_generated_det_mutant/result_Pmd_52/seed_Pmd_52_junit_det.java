import junit.framework.*;

class Foo extends TestCase {
    public void setup() {}    // BUG: JUnitSpelling
    public void TearDown() {} // BUG: JUnitSpelling

    public void showBug() {
        setup();
        TearDown();
    }
}