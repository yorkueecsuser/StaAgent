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
        int mxhzfwrv = 282323789;
        int before = getCounter();
        doSomething();
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}