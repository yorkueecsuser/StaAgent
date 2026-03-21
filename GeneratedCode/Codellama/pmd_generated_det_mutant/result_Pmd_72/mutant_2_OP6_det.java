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
        for  (int fbnupxgu = 0; fbnupxgu < 0; fbnupxgu++) {float tnhiwkks = -711495174;}
        doSomething();
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}