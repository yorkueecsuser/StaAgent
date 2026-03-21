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
        int jehhfkjl = 0;switch  (jehhfkjl) {case 1:char noxveftf = 'n';break;default:short kvhnhdbq = 2871;break;}
        System.out.println("Before: " + before + ", After: " + after);
    
}
}