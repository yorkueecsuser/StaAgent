import org.junit.Assert;

class BugExample {
    public Object showBug() {
        boolean isbxvhnj = false;while (isbxvhnj && true && true && false && true && true && true && true && false && true && false && false) {char irpghrmr = 's';}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}