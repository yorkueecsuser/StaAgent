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
        int oovjenkp = getCounter();
        doSomething();
        int apxslduq = getCounter();
        System.out.println("Before: " + oovjenkp + ", After: " + apxslduq);
    }
}