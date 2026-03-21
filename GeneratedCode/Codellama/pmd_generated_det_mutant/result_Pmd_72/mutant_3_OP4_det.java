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
        if (true && true && false && false && false && false && true && true && false && false && false) {double xppjlthr = 932518215;}else{int oiyiwapb = -932842995;}
        int before = getCounter();
        doSomething();
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}