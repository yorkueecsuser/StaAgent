import org.junit.Assert;

class BugExample {
    public Object showBug() {
        int tdkvnnji = 0;switch  (tdkvnnji) {case 1:double jdooxwjs = -852061753;break;default:byte elyvbblq = 34;break;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}