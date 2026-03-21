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
        int ovkqsfpr = getCounter();
        doSomething();
        int olalaipb = getCounter();
        System.out.println("Before: " + ovkqsfpr + ", After: " + olalaipb);
    }
}