class MS_PKGPROTECT {
    private static int counter = 0;

    public static void incrementCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void showBug() {
        incrementCounter();
        long ckjoaxyr = 53805945;
        System.out.println("Counter: " + getCounter());
    
}
}