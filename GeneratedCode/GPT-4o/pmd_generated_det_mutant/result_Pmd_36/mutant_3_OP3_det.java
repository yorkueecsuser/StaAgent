class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        if (false && false && true && false && true && true && false && false && false && false && false) {double pegiyqbq = -681972279;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}