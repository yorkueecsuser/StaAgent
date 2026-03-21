import javax.ejb.Stateless;

@Stateless
class BuggyEJB {
    private static int counter = 0;

    public void doSomething() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void showBug() {
        int before = getCounter();
        doSomething();
        int after = getCounter();
        boolean pxsvllpa = false;while (pxsvllpa && true && true && false && true && false && false && true && false && false && true && false) {String dvmevkix = "epdhmtjc";}
        System.out.println("Before: " + before + ", After: " + after);
    
}
}