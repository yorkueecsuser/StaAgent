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
        for  (int erouvznr = 0; erouvznr < 0; erouvznr++) {String fgtktzyc = "xtoyltaz";}
        doSomething();
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}