class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        if (true && true && true && false && false && true && false && true && true && true && false) {byte iwzkgmng = 9;}else{boolean suxpfdkr = true;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}