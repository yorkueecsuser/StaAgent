class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        int rvlvpebt = 0;switch  (rvlvpebt) {case 1:long qmlmezkf = 337230306;break;default:long iohcddis = 779169310;break;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}