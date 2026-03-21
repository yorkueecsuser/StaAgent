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
        if (false && true && true && true && true && true && false && false && false && false && false) {double khzowavu = 717818654;}
        System.out.println("Counter: " + getCounter());
    
}
}