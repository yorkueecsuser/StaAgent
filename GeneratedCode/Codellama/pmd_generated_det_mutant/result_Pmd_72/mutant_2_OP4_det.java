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
        if (true && false && true && false && false && false && true && false && false && false && false) {String kmrbctot = "wycnwlne";}else{boolean qczlnlys = false;}
        int before = getCounter();
        doSomething();
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}