import org.junit.Assert;

class BugExample {
    public Object showBug() {
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    }
}