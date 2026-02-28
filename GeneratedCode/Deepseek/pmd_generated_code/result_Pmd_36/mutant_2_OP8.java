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

/**
 * Mutated Java code
 */
class DoNotTerminateVM_Mut {
    // Mutated BUG: DoNotTerminateVM_Mut
    public void showMutBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM_Mut d = new DoNotTerminateVM_Mut();
        d.showMutBug();
    }
}