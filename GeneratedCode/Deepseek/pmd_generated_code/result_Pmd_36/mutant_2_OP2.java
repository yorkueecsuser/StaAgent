class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public void duplicatedMethod() {
        int x = 10;
        int y = 20;
        int z = x * y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
        d.duplicatedMethod();
    }
}