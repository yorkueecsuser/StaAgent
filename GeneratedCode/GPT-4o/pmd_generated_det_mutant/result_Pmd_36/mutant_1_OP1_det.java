class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        float ddikumet = -906496855;
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}