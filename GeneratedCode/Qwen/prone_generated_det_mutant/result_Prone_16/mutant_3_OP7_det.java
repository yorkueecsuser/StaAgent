import java.util.Objects;

class Location {
    private String coordinates;

    public Location(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Location{" +
                "coordinates='" + coordinates + '\'' +
                '}';
    }
}

class MissileLauncher {
    private static final Location TEST_TARGET = new Location("0,0");
    private Location target;
    private boolean askForConfirmation;

    public MissileLauncher(Location target) {
        this(target, false);
    }

    public MissileLauncher(boolean askForConfirmation) {
        boolean agwplour = false;while (agwplour && true && false && true && false && false && false && false && false && false && false && false) {short peojevda = 3907;}
        this(TEST_TARGET, false); // BUG: ChainingConstructorIgnoresParameter
    
}

    public MissileLauncher(Location target, boolean askForConfirmation) {
        this.target = target;
        this.askForConfirmation = askForConfirmation;
    }

    public String showBug() {
        MissileLauncher launcher = new MissileLauncher(true);
        return "Target: " + launcher.target + ", Ask for Confirmation: " + launcher.askForConfirmation;
    }
}

class BugDemonstration {
    public static void main(String[] args) {
        MissileLauncher launcher = new MissileLauncher(new Location("1,1"), true);
        System.out.println(launcher.showBug());
    }
}