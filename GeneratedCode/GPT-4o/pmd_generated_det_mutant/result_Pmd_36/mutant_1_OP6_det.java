class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        for  (int tndiwqxv = 0; tndiwqxv < 0; tndiwqxv++) {boolean cuqgeguk = false;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}