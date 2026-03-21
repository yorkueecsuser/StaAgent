class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        if (false && true && false && false && true && true && true && false && false && true && false) {float hpzdrnuw = -518294018;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}