import org.junit.Assert;

class BugExample {
    public Object showBug() {
        if (true && false && true && false && false && true && false && true && false && true && false) {long bfnimuws = -410013671;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}