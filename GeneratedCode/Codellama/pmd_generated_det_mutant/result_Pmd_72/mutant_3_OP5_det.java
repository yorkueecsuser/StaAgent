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
        int aupnuxnz = 0;switch  (aupnuxnz) {case 1:boolean pumteoyc = true;break;default:long kvyziuny = -173854735;break;}
        System.out.println("Before: " + before + ", After: " + after);
    
}
}