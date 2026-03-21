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
        boolean wibjuhva = false;while (wibjuhva && true && true && true && true && true && true && true && true && false && true && false) {short sorrjvjm = 9540;}
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}