class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        for  (int lmjrkbls = 0; lmjrkbls < 0; lmjrkbls++) {int yycbjref = 657306441;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}