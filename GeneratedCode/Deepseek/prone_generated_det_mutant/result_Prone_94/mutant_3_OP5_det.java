import org.junit.Assert;

class BugExample {
    public Object showBug() {
        int bzuzxrxf = 0;switch  (bzuzxrxf) {case 1:short gpllnzlq = -7569;break;default:long muerokqw = 625031162;break;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}