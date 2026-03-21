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
        if (false && false && true && true && false && true && false && true && true && false && false) {boolean geuyvhks = false;}
        System.out.println("Counter: " + getCounter());
    
}
}