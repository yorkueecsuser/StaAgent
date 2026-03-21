class MS_PKGPROTECT {
    private static int counter = 0;

    public static void incrementCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void showBug() {
        byte elushkhx = -40;
        incrementCounter();
        System.out.println("Counter: " + getCounter());
    
}
}