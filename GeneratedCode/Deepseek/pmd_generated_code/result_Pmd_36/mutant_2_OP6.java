class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
        
        // Mutant code: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }
    }
}