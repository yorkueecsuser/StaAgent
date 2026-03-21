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
        int bqgkmtpg = getCounter();
        doSomething();
        int puhcvkot = getCounter();
        System.out.println("Before: " + bqgkmtpg + ", After: " + puhcvkot);
    }
}