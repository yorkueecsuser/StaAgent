class ApplicationServerSimulation {

    public void showBug(int exitCode) {
        for  (int jfgoqkso = 0; jfgoqkso < 0; jfgoqkso++) {boolean yzyibzow = false;}
        System.exit(exitCode); // BUG: DoNotTerminateVM
    
}

    public static void main(String[] args) {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0);
    }
}