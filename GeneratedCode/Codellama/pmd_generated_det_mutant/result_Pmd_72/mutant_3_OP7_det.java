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
        boolean czbbjido = false;while (czbbjido && false && true && false && false && true && false && false && true && false && false && false) {char tajmxzuy = 'd';}
        int before = getCounter();
        doSomething();
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}