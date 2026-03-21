class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        if (false && true && true && true && false && true && true && true && false && false && false) {float cqvajspa = 497308030;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}