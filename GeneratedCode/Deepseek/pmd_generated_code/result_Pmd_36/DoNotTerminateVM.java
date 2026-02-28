class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}

class MutatedDoNotTerminateVM {
    // Renamed BUG: DoNotTerminateVM
    public void renamedShowBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void renamedMain(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}