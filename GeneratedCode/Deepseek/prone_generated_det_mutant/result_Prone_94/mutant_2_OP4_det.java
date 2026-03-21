import org.junit.Assert;

class BugExample {
    public Object showBug() {
        if (false && false && true && false && true && false && true && false && false && true && false) {byte dclifkyz = 38;}else{String jzqmffrm = "dlmwbcur";}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}