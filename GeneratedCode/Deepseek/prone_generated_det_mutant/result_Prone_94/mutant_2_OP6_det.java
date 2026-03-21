import org.junit.Assert;

class BugExample {
    public Object showBug() {
        for  (int ccedymhq = 0; ccedymhq < 0; ccedymhq++) {long aksbvsvf = -576901392;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}