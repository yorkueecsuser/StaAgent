import org.junit.Assert;

class BugExample {
    public Object showBug() {
        boolean lmtvliut = true;
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}