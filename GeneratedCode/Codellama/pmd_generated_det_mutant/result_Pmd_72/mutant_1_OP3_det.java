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
        if (false && false && true && false && true && false && true && true && false && true && false) {byte afugvekd = -56;}
        System.out.println("Before: " + before + ", After: " + after);
    
}
}