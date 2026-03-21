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
        if (false && true && false && false && false && true && true && true && false && true && false) {boolean jdubcnxr = true;}else{byte qbrejqlw = 114;}
        System.out.println("Counter: " + getCounter());
    
}
}