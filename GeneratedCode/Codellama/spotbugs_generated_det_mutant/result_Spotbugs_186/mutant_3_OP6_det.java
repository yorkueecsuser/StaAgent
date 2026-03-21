class MS_PKGPROTECT {
    private static int counter = 0;

    public static void incrementCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void showBug() {
        for  (int zwayvbci = 0; zwayvbci < 0; zwayvbci++) {byte zsjckjou = 117;}
        incrementCounter();
        System.out.println("Counter: " + getCounter());
    
}
}