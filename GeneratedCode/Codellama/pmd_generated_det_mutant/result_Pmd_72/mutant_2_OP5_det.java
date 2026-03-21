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
        int sruesybn = 0;switch  (sruesybn) {case 1:String qfgoxafe = "frowftwz";break;default:long jrkcrnca = -266279827;break;}
        int after = getCounter();
        System.out.println("Before: " + before + ", After: " + after);
    
}
}