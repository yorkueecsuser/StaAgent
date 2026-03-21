import org.junit.Assert;

class BugExample {
    public Object showBug() {
        for  (int grnjjnhp = 0; grnjjnhp < 0; grnjjnhp++) {String ensstyso = "iqqvdloq";}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}