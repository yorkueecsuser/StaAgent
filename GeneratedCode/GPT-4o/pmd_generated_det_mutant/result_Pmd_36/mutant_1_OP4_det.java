class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        if (false && true && true && true && false && true && false && false && true && false && false) {long upcblzij = 686414896;}else{int hatoszuk = 280629993;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}