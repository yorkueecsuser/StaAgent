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
        for  (int vkyxpfgl = 0; vkyxpfgl < 0; vkyxpfgl++) {char eipyruph = 's';}
        System.out.println("Counter: " + getCounter());
    
}
}