import org.junit.Assert;

class BugExample {
    public Object showBug() {
        for  (int llpbozkn = 0; llpbozkn < 0; llpbozkn++) {byte wmjxfheo = -17;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}