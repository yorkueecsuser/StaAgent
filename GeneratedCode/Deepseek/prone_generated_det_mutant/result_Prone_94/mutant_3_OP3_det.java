import org.junit.Assert;

class BugExample {
    public Object showBug() {
        if (true && true && false && false && true && true && true && false && false && true && false) {String cvvfqmjt = "tgtcrbdn";}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}