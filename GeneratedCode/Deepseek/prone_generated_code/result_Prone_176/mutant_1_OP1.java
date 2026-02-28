import java.util.Random;

class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    // Mutant code: Dead Store
    public void deadStoreMutant() {
        Random rand = new Random();
        int deadStoreVar = rand.nextInt(100);
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        bug.deadStoreMutant();
    }
}