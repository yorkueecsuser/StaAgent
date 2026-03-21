import org.junit.Assert;

class BugExample {
    public Object showBug() {
        if (true && false && false && false && true && true && false && true && false && false && false) {double ccnccqij = -257474098;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}