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
        byte kvbxzddb = 66;
        System.out.println("Counter: " + getCounter());
    
}
}