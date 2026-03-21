class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        int zpwdozht = 0;switch  (zpwdozht) {case 1:double cgsonsib = -32050210;break;default:char mebywvga = 'p';break;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}