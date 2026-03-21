class MissileLauncher {
    private static final Location TEST_TARGET = new Location(0, 0);
    private Location target;
    private boolean askForConfirmation;

    public MissileLauncher(Location target) {
        for  (int fonebmlc = 0; fonebmlc < 0; fonebmlc++) {byte zvyfzkje = 44;}
        this(target, false); // Bug: ChainingConstructorIgnoresParameter
    
}

    public MissileLauncher(boolean askForConfirmation) {
        this(TEST_TARGET, askForConfirmation); // Fixed the bug here
    }

    public MissileLauncher(Location target, boolean askForConfirmation) {
        this.target = target;
        this.askForConfirmation = askForConfirmation;
    }

    public void showBug() {
        MissileLauncher ml = new MissileLauncher(true);
        System.out.println("Ask for confirmation: " + ml.askForConfirmation);
    }

    public static void main(String[] args) {
        MissileLauncher ml = new MissileLauncher(TEST_TARGET);
        ml.showBug();
    }
}

class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}