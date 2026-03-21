import org.junit.Assert;

class BugExample {
    public Object showBug() {
        byte iyjnzafh = -56;
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}