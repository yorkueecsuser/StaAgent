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
        if (false && false && false && false && false && true && true && false && false && true && false) {int rmdyknsq = 778465953;}
        System.out.println("Counter: " + getCounter());
    
}
}