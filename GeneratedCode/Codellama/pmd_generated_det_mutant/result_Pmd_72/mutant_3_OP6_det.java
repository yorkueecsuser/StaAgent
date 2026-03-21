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
        for  (int ijmdbzin = 0; ijmdbzin < 0; ijmdbzin++) {boolean ugpiwefm = true;}
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}